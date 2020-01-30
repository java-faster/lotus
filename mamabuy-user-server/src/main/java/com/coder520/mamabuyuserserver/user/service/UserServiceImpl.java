package com.coder520.mamabuyuserserver.user.service;

import com.coder520.mamabuyuserserver.MamabuyUserServerApplication;
import com.coder520.mamabuyuserserver.common.constants.Constants;
import com.coder520.mamabuyuserserver.common.exception.MaMaBuyException;
import com.coder520.mamabuyuserserver.common.resp.ApiResult;
import com.coder520.mamabuyuserserver.user.dao.UserMapper;
import com.coder520.mamabuyuserserver.user.entity.User;
import com.coder520.mamabuyuserserver.user.entity.UserElement;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private CuratorFramework curatorFramework;

    @Override
    public UserElement login(User user) {

        User existUser=userMapper.selectByEmail(user.getEmail());

        UserElement ue=new UserElement();

        if(existUser!=null){

            if (bCryptPasswordEncoder.matches(user.getPassword(),existUser.getPassword())){
                ue.setEmail(user.getEmail());
                ue.setId(existUser.getId());
                ue.setNickname(existUser.getNickname());
                ue.setUuid(existUser.getUuid());
            }
            else{
                //throw new MaMaBuyException("密码错误");
            }
        }else{
            //throw new MaMaBuyException("用户不存在");
        }
        return ue;
    }

    @Override
    public ApiResult register(User user) {
        boolean retry=true;
        InterProcessMutex lock=null;
        try {
            lock=new InterProcessMutex(curatorFramework,Constants.USER_REGISTER_DISTRIBUTE_LOCK_PATH);
            do {
                if (lock.acquire(3000,TimeUnit.MILLISECONDS)){
                    //查询账号是否重复
                    User repeatedUser=userMapper.selectByEmail(user.getEmail());
                    if(repeatedUser!=null){
                        throw new MaMaBuyException("用户已注册");
                    }
                    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
                    user.setNickname("码码购用户"+user.getNickname());
                    userMapper.insertSelective(user);
                    retry=false;
                }
            }while (retry);
        }catch (Exception e){
        log.info("用户注册异常",e);
        e.printStackTrace();
        return new ApiResult(Constants.RESP_STATUS_INTERNAL_ERROR,"用户注册失败");
        }finally {
            if(lock!=null){

                try {
                    lock.release();
                    log.info(user.getEmail()+Thread.currentThread().getName()+"释放锁");
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        }
        return new ApiResult(Constants.RESP_STATUS_OK,"注册成功") ;
    }
}

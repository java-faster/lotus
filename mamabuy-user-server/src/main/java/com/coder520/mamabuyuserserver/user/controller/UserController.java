package com.coder520.mamabuyuserserver.user.controller;

import com.coder520.mamabuyuserserver.common.constants.Constants;
import com.coder520.mamabuyuserserver.common.resp.ApiResult;
import com.coder520.mamabuyuserserver.user.entity.User;
import com.coder520.mamabuyuserserver.user.entity.UserElement;
import com.coder520.mamabuyuserserver.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/login")
    public ApiResult login(@RequestBody @Valid User user, HttpSession session){
        ApiResult<UserElement> result=new ApiResult<UserElement>(Constants.RESP_STATUS_OK,"登陆成功");
        //业务层校验登陆信息
        UserElement ue=userService.login(user);
        if(ue!=null){
            if (session.getAttribute(Constants.REQUEST_USER_SESSION)==null){
                    session.setAttribute(Constants.REQUEST_USER_SESSION,ue);
            }
            result.setData(ue);
        }else{
            result.setMessage("用户名或密码错误，请重试");
        }
        return result;
    }

    @RequestMapping("/register")
    public ApiResult register(@RequestBody @Valid User user,HttpSession session){

        ApiResult result=userService.register(user);

        return result;
    }

}

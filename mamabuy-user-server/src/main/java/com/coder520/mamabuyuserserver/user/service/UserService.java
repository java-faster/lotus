package com.coder520.mamabuyuserserver.user.service;

import com.coder520.mamabuyuserserver.common.resp.ApiResult;
import com.coder520.mamabuyuserserver.user.entity.User;
import com.coder520.mamabuyuserserver.user.entity.UserElement;
import org.springframework.stereotype.Service;

@Service("userService")
public interface UserService {

    UserElement login(User user);

    ApiResult register(User user);
}

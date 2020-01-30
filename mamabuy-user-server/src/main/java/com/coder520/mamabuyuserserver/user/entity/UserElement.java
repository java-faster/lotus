package com.coder520.mamabuyuserserver.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserElement implements Serializable {

    private Long id;

    private Long uuid;

    private String email;

    private String nickname;
}

package com.coder520.mamabuytradeserver.common.resp;

import com.coder520.mamabuytradeserver.common.constants.Constants;
import lombok.Data;


@Data
public class ApiResult <T> {

    private int code=Constants.RESP_STATUS_OK;

    private String message;

    private T data;

    public ApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

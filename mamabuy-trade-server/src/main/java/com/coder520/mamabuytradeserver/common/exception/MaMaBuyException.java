package com.coder520.mamabuytradeserver.common.exception;

import com.coder520.mamabuytradeserver.common.constants.Constants;

/**
 * Created by JackWang<coder520.com>
 *
 * @Date 18:52 2018/1/16
 */
public class MaMaBuyException extends RuntimeException{

    private int statusCode = Constants.RESP_STATUS_INTERNAL_ERROR;

    public MaMaBuyException(int statusCode,String message) {
        super(message);
        this.statusCode = statusCode;
    }
    public MaMaBuyException(String message) {
        super(message);
    }

    public int getStatusCode() {
        return statusCode;
    }
}

package com.coder520.mamabuytradeserver.common.exception;

import com.coder520.mamabuytradeserver.common.constants.Constants;
import com.coder520.mamabuytradeserver.common.resp.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@ResponseBody
@Slf4j
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public ApiResult handleExpection(Exception e){
        log.error(e.getMessage(),e);
        return new ApiResult(Constants.RESP_STATUS_INTERNAL_ERROR,"系统异常，请稍后再试!");
    }

//    @ExceptionHandler(Exception.class)
//    public ApiResult mamaExpection(MaMaBuyException e){
//        return new ApiResult(e.getStatusCode(),e.getMessage());
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResult handleIllegalParamExpection(MethodArgumentNotValidException e){
        List<ObjectError> objectErrorList= e.getBindingResult().getAllErrors();
        String message="参数不合法";
        if(objectErrorList.size()>0){
            message=objectErrorList.get(0).getDefaultMessage();
        }
        return new ApiResult(Constants.RESP_STATUS_BADREQUEST,message);
    }

}

package com.chen.api;

public class ApiException extends Exception {
    public int code;
    public String reason;
    public ApiException(int code,String reason){
        this.code = code;
        this.reason = reason;
    }

    public ApiException(int code,String reason,Throwable rootCause){
        super(rootCause);
        this.code = code;
        this.reason = reason;
    }
}

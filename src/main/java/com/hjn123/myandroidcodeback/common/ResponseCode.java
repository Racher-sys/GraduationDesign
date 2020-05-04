package com.hjn123.myandroidcodeback.common;

public enum ResponseCode {
    USERNAME_NOT_EMPTY(1,"用户名不能为空"),
    PASSWORD_NOT_EMPTY(2,"密码不能为空"),
    USERNAME_NOT_EXISTS(3,"用户名不存在"),
    PASSWORD_ERROR(4,"密码错误"),
    PARAMTER_NOT_EMPTY(5,"参数值不能为空"),
    PHONE_NOT_EMPTY(6,"手机号不能为空"),
    USERNAME_IS_EXISTS(7,"用户名已经存在"),
    PHONE_IS_EXISTS(8,"手机号已经存在"),
    REGISTER_FAIL(9,"注册失败")



    ;
    private int code;
    private String msg;

    ResponseCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package com.hjn123.myandroidcodeback.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 封装前端统一实体类
 * 加JsonSerialize注解是为了让ServerResponse显示非空的属性
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> {

    private int status;//状态0：接口调用成功，1：接口调用失败
    private T data;//当status=0，将返回的数据封装到data中
    private String msg;//提示信息

    public ServerResponse(){}
    private ServerResponse(int status){
        this.status = status;
    }

    private ServerResponse(int status,T data){
        this.status = status;
        this.data = data;
    }
    private ServerResponse(int status,T data,String msg){
        this.status = status;
        this.data = data;
        this.msg = msg;
    }
    @JsonIgnore
    public boolean isSuccess(){
        return this.status==0;
    }


    /**
     * 接口调用成功
     * 返回值
     * @return
     */
    public static ServerResponse createServerResponseBySuccess(){
        return new ServerResponse(0);
    }

    public static <T> ServerResponse createServerResponseBySuccess(T data){
        return new ServerResponse(0,data);
    }

    public static <T> ServerResponse createServerResponseBySuccess(T data,String msg){
        return new ServerResponse(0,data,msg);
    }

    /**
     * 接口调用失败
     * 返回值
     * @param status
     * @return
     */
    public static ServerResponse createServerResponseByFail(int status){
        return new ServerResponse(status);
    }

    public static ServerResponse createServerResponseByFail(int status,String msg){
        return new ServerResponse(status,null,msg);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

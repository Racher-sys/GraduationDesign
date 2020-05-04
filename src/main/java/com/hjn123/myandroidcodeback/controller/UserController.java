package com.hjn123.myandroidcodeback.controller;

import com.hjn123.myandroidcodeback.common.Const;
import com.hjn123.myandroidcodeback.pojo.Consumer;
import com.hjn123.myandroidcodeback.service.IConsumerService;
import com.hjn123.myandroidcodeback.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.hjn123.myandroidcodeback.pojo.UserInfo;

import javax.servlet.http.HttpSession;

//返回的数据类型是jason
@RestController
@RequestMapping("/portal")
public class UserController {

//    //登陆 login.do?username=xxx&password=xxx
//    @RequestMapping(value = "/login.do")
//    public UserInfo login(@RequestParam(value = "username",required = false,defaultValue = "") String username,
//                          @RequestParam("password") String password){
//
//        UserInfo userInfo = new UserInfo();
//        userInfo.setId(1);
//        userInfo.setUsername(username);
//        userInfo.setPassword(password);
//        return userInfo;
//    }

    @Autowired
    IConsumerService consumerService;

    @RequestMapping("/user/login.do")
    public ServerResponse login(String username, String password, HttpSession session){
//        Consumer consumer=new Consumer();
//        consumer.setUsername(username);
//        consumer.setPassword(password);
//        return ServerResponse.createServerResponseBySuccess(consumer)
        ServerResponse serverResponse = consumerService.loginLogic(username,password);

        if(serverResponse.isSuccess()){
            session.setAttribute(Const.CURRENT_CONSUMER,serverResponse.getData());
        }
        return serverResponse;
    }

    @RequestMapping("/user/register.do")
    public ServerResponse register(Consumer consumer){

        return consumerService.registerLogic(consumer);

    }


}

package com.hjn123.myandroidcodeback.service;

import com.hjn123.myandroidcodeback.pojo.Consumer;
import com.hjn123.myandroidcodeback.utils.ServerResponse;

public interface IConsumerService {
    /**
     * 登陆
     */
    public ServerResponse loginLogic(String username ,String password);
    /**
     * 注册
     */
    public ServerResponse registerLogic(Consumer consumer);
}

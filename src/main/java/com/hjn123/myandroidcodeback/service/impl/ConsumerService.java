package com.hjn123.myandroidcodeback.service.impl;

import com.hjn123.myandroidcodeback.common.ResponseCode;
import com.hjn123.myandroidcodeback.dao.ConsumerMapper;
import com.hjn123.myandroidcodeback.pojo.Consumer;
import com.hjn123.myandroidcodeback.service.IConsumerService;
import com.hjn123.myandroidcodeback.utils.ServerResponse;
import com.hjn123.myandroidcodeback.vo.ConsumerVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService implements IConsumerService {

    @Autowired
    ConsumerMapper consumerMapper;
    @Override
    public ServerResponse loginLogic(String username, String password) {

        //step1：用户名和密码的非空判断
        if(StringUtils.isBlank(username)){//isBlank判断username为null，length=0或含有空格或tab制表符
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EMPTY.getCode(),ResponseCode.USERNAME_NOT_EMPTY.getMsg());

        }
        if(StringUtils.isBlank(password)){
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_NOT_EMPTY.getCode(),ResponseCode.PASSWORD_NOT_EMPTY.getMsg());

        }

        //step2:查看用户是否存在

        Integer count=consumerMapper.findByUsername(username);
        if(count==null){
            //用户名不存在

            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EXISTS.getCode(),ResponseCode.USERNAME_NOT_EXISTS.getMsg());

        }

        //step3:根据用户名和密码去查询

        Consumer consumer = consumerMapper.findByUsernameAndPassword(username,password);

        if(consumer==null){

            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_ERROR.getCode(),ResponseCode.PASSWORD_ERROR.getMsg());

        }

        //step4:返回结果
        return ServerResponse.createServerResponseBySuccess(convert(consumer));

    }

    @Override
    public ServerResponse registerLogic(Consumer consumer) {

        //step1:判断参数不能为空
        if(consumer==null){
            return ServerResponse.createServerResponseByFail(ResponseCode.PARAMTER_NOT_EMPTY.getCode(),ResponseCode.PARAMTER_NOT_EMPTY.getMsg());
        }
        String username=consumer.getUsername();
        String password=consumer.getPassword();
        String phone=consumer.getPhone();


        //step2：用户名、密码、手机号的非空判断
        if(StringUtils.isBlank(username)){
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EMPTY.getCode(),ResponseCode.USERNAME_NOT_EMPTY.getMsg());

        }
        if(StringUtils.isBlank(password)){
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_NOT_EMPTY.getCode(),ResponseCode.PASSWORD_NOT_EMPTY.getMsg());

        }
        if(StringUtils.isBlank(phone)){
            return ServerResponse.createServerResponseByFail(ResponseCode.PHONE_NOT_EMPTY.getCode(),ResponseCode.PHONE_NOT_EMPTY.getMsg());

        }

        //step3：判断用户名是否存在

        Integer name_count=consumerMapper.findByUsername(username);
        if(name_count != null){
            //用户名存在

            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_IS_EXISTS.getCode(),ResponseCode.USERNAME_IS_EXISTS.getMsg());

        }

        //step4：判断电话号码是否存在

        Integer phone_count=consumerMapper.findByPhone(phone);
        if(phone_count !=null){
            //手机号码已经存在

            return ServerResponse.createServerResponseByFail(ResponseCode.PHONE_IS_EXISTS.getCode(),ResponseCode.PHONE_IS_EXISTS.getMsg());

        }

        //step5：注册

        //consumer.setId(1);
        Integer result=consumerMapper.insert(consumer);
        if(result==0){
            //注册失败
            return ServerResponse.createServerResponseByFail(ResponseCode.REGISTER_FAIL.getCode(),ResponseCode.REGISTER_FAIL.getMsg());


        }

        //注册成功
        return ServerResponse.createServerResponseBySuccess();
    }

    private ConsumerVO convert(Consumer consumer){
        ConsumerVO consumerVO = new ConsumerVO();
        consumerVO.setId(consumer.getId());
        consumerVO.setPhone(consumer.getPhone());
        consumerVO.setUsername(consumer.getUsername());


        return consumerVO;
    }
}

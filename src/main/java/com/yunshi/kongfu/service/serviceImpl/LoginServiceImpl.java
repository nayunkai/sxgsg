package com.yunshi.kongfu.service.serviceImpl;

import com.yunshi.kongfu.entity.User;
import com.yunshi.kongfu.mapper.UserMapper;
import com.yunshi.kongfu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author: yunshi
 * @Description:
 * @Date: Created in 上午10:57 2018/1/29
 * @Modified by:
 */
@Service
public class LoginServiceImpl implements LoginService{


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserInfo(String userName) {

        System.out.println("=====userName=="+userName);
        return userMapper.queryLoginByUserName(userName);
    }
}

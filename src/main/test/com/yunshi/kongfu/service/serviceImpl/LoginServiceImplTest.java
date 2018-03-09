package com.yunshi.kongfu.service.serviceImpl;

import com.yunshi.kongfu.entity.User;
import com.yunshi.kongfu.service.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yunshi
 * @Description:
 * @Date: Created in 下午2:39 2018/1/30
 * @Modified by:
 */
class LoginServiceImplTest {

    @Autowired
    private LoginService loginService;

    @Test
    void queryUserInfo() {

        String userName = "王军伟";
        List<User> list = loginService.queryUserInfo(userName);
        System.out.println(list);

    }

}
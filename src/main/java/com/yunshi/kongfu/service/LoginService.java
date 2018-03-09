package com.yunshi.kongfu.service;

import com.yunshi.kongfu.entity.User;

import java.util.List;

/**
 * @author: yunshi
 * @Description:
 * @Date: Created in 上午10:33 2018/1/29
 * @Modified by:
 */
public interface LoginService {

    List<User> queryUserInfo(String userName);

}

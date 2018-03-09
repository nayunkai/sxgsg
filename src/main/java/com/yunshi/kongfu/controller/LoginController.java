package com.yunshi.kongfu.controller;

import com.alibaba.fastjson.JSONObject;
import com.yunshi.kongfu.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author: yunshi
 * @Description:
 * @Date: Created in 上午11:07 2018/1/29
 * @Modified by:
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/isLogin",method = RequestMethod.GET)
    public JSONObject isLogin(String userName){

        JSONObject json = new JSONObject();
        json.put("result",loginService.queryUserInfo(userName));

        return json;
    }



}

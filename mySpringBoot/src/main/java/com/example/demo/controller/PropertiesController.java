package com.example.demo.controller;

import com.example.demo.model.Properties;
import com.example.demo.model.TestUser;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shijy
 * @Date 2018/11/21 09 : 39
 * @Descriprion
 */
@RestController
@RequestMapping("/properties")
public class PropertiesController {

    @Autowired
    private Properties properties;
    @Autowired
    public User user;
    @Autowired
    public TestUser testUser;

    /**
     * 自定义属性与加载
     * @return
     */
    @RequestMapping(value = "/pro",method = RequestMethod.GET)
    public String properties(){
        String info =  properties.getUsername() + ":" + properties.getAge();
        return "properties : " + info+"=====\r"+properties.getToString();
    }

    /**
     * 自定义注入bean
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String user(){
        return "user : " + user.getUsername() + ":" + user.getAge();
    }

    /**
     * 自定义额外的配置文件
     * @return
     */
    @RequestMapping(value = "/testUser",method = RequestMethod.GET)
    public String testUser(){
        return "testUser : " + testUser.getUsername() + ":" + testUser.getAge();
    }

}

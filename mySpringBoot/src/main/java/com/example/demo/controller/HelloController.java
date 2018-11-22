package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shijy
 * @Date 2018/11/21 09 : 22
 * @Descriprion
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String name(){
        return "hello";
    }
}

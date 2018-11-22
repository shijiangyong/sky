package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author shijy
 * @Date 2018/11/21 09 : 59
 * @Descriprion
 */
@Component
@PropertySource("classpath:test.yml")
@ConfigurationProperties(prefix = "test.user")
public class TestUser {
    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

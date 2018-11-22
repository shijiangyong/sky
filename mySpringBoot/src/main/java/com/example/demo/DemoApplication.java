package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shijy
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("=====加载完毕=====");
        SpringApplication.run(DemoApplication.class, args);
    }
}

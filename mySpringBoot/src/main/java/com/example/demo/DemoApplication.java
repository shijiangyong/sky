package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shijy
 */
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableSwagger2
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("=====加载完毕=====");
        SpringApplication.run(DemoApplication.class, args);
    }
}

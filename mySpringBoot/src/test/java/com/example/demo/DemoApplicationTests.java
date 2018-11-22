package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() throws SQLException {
       /* String url = "jdbc:mysql://192.168.1.11:3306/xiaoshitou";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","sa@123");
            System.out.println("con========================" + con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        DriverManagerDataSource source=new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://192.168.1.11:3306/xiaoshitou");
        source.setUsername("root");
        source.setPassword("sa@123");
        Connection conn=source.getConnection();
        System.out.println("source : "+conn);
    }

}

package com.example.demo.model;

import java.util.Date;

/**
 * @author shijy
 * @Date 2018/11/21 10 : 51
 * @Descriprion
 */
public class SqlUser {
    private int id;
    private int age;
    private String username;
    private Date ctm;

    public SqlUser() {
    }

    public SqlUser(int id, int age, String username, Date ctm) {
        this.id = id;
        this.age = age;
        this.username = username;
        this.ctm = ctm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}

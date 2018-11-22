package com.example.demo.service;

import com.example.demo.model.MyBatisUser;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/21 15 : 54
 * @Descriprion
 */
public interface BatisUserService {

    /**
     * 根据ID差用户信息
     * @param id
     * @return
     */
    MyBatisUser getUserById(Integer id);

    /**
     * 用户列表
     * @return
     */
    List<MyBatisUser> getUserList();

    /**
     * 添加用户
     * @param user
     * @return
     */
    int add(MyBatisUser user);

    /**
     * 更新用户
     * @param id
     * @param user
     * @return
     */
    int update(Integer id,MyBatisUser user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(Integer id);
}

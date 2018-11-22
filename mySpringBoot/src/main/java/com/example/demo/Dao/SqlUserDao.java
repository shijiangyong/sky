package com.example.demo.Dao;

import com.example.demo.model.SqlUser;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/21 10 : 57
 * @Descriprion
 */
public interface SqlUserDao {
    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    SqlUser getUserById(Integer id);

    /**
     * 返回用户列表
     * @return
     */
     List<SqlUser> getUserList();

    /**
     * 添加用户
     * @param user
     * @return
     */
     int add(SqlUser user);

    /**
     * 更新用户信息
     * @param id
     * @param user
     * @return
     */
     int update(Integer id, SqlUser user);

    /**
     * 删除用户
     * @param id
     * @return
     */
     int delete(Integer id);

}

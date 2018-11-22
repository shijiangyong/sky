package com.example.demo.mapper;

import com.example.demo.model.MyBatisUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/22 13 : 41
 * @Descriprion
 */
@Repository
public interface UserMapper {
    /**
     * 查找用户
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
    int addUser(MyBatisUser user);

    /**
     * 更新用户
     * @param id
     * @param user
     * @return
     */
    int updateUser(@Param("id") Integer id, @Param("user") MyBatisUser user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);
}

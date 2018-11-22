package com.example.demo.mapper;

import com.example.demo.model.MyBatisUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/21 15 : 40
 * @Descriprion @Mapper 这里可以使用@Mapper注解，但是每个mapper都加注解比较麻烦
 * 所以统一配置@MapperScan在扫描路径在application类中
 */
public interface BatisUserMapper {

    /**
     * 查找单个用户
     * @param id
     * @return
     */
    @Select("select * from tb_user where id = #{id}")
    MyBatisUser getUserById(Integer id);

    /**
     * 用户列表
     * @return
     */
    @Select("select * from tb_user")
    List<MyBatisUser> getUserList();

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Insert("insert into tb_user(username,age,ctm) values(#{username},#{age},now())")
    int add(MyBatisUser user);

    /**
     * 更新用户信息
     * @param id
     * @param user
     * @return
     */
    @Update("update tb_user set username=#{user.username},age=#{user.age} where id = #{id}")
    int update(@Param("id") Integer id,@Param("user") MyBatisUser user);

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    @Delete("delete from tb_user where id = #{id}")
    int delete(Integer id);

}

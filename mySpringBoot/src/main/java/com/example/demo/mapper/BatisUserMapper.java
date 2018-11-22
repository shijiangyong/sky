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

    @Select("select * from tb_user where id = #{id}")
    MyBatisUser getUserById(Integer id);

    @Select("select * from tb_user")
    List<MyBatisUser> getUserList();

    @Insert("insert into tb_user(username,age,ctm) values(#{username},#{age},now())")
    int add(MyBatisUser user);

    @Update("update tb_user set username=#{user.username},age=#{user.age} where id = #{id}")
    int update(@Param("id") Integer id,@Param("user") MyBatisUser user);

    @Delete("delete from tb_user where id = #{id}")
    int delete(Integer id);

}

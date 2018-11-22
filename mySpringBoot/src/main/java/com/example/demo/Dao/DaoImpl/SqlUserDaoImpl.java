package com.example.demo.Dao.DaoImpl;

import com.example.demo.Dao.SqlUserDao;
import com.example.demo.model.SqlUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/21 11 : 01
 * @Descriprion
 */
@Repository
public class SqlUserDaoImpl implements SqlUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查找用户
     * @param id
     * @return
     */
    @Override
    public SqlUser getUserById(Integer id) {
        List<SqlUser> list = jdbcTemplate.query("select * from tb_user where id=?",
                new Object[]{id},new BeanPropertyRowMapper<>(SqlUser.class));
        if (list != null && list.size()>0) {
            return list.get(0);
        }else{
            return null;
        }
    }

    /**
     * 获取用户列表
     * @return
     */
    @Override
    public List<SqlUser> getUserList() {
        List<SqlUser> list = jdbcTemplate.query("select * from tb_user",
                new Object[]{},new BeanPropertyRowMapper<>(SqlUser.class));
        if(list.size()>0 && list != null){
            return list;
        }else{
            return null;
        }
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public int add(SqlUser user) {
        return jdbcTemplate.update("insert into tb_user(username,age,ctm) values(?,?,?)",
                user.getUsername(),user.getAge(),new Date());
    }

    /**
     * 更新用户
     * @param id
     * @param user
     * @return
     */
    @Override
    public int update(Integer id, SqlUser user) {
        return jdbcTemplate.update("update tb_user set username=?,age=? where id = ?",
                user.getUsername(),user.getAge(),id);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("delete from tb_user where id=?",id);
    }
}

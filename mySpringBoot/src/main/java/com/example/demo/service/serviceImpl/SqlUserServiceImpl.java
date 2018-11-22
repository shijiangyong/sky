package com.example.demo.service.serviceImpl;

import com.example.demo.Dao.SqlUserDao;
import com.example.demo.model.SqlUser;
import com.example.demo.service.SqlUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/21 11 : 23
 * @Descriprion
 */
@Service
public class SqlUserServiceImpl implements SqlUserService {

    @Autowired
    private SqlUserDao sqlUserDao;


    @Override
    public SqlUser getUserById(Integer id) {
        return sqlUserDao.getUserById(id);
    }

    @Override
    public List<SqlUser> getUserList() {
        return sqlUserDao.getUserList();
    }

    @Override
    public int add(SqlUser user) {
        return sqlUserDao.add(user);
    }

    @Override
    public int update(Integer id, SqlUser user) {
        return sqlUserDao.update(id,user);
    }

    @Override
    public int delete(Integer id) {
        return sqlUserDao.delete(id);
    }
}

package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.BatisUserMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.MyBatisUser;
import com.example.demo.service.BatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shijy
 * @Date 2018/11/22 11 : 20
 * @Descriprion
 */
@Service
public class BatisUserServiceImpl implements BatisUserService {

    @Autowired
    private BatisUserMapper batisUserMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public MyBatisUser getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<MyBatisUser> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(MyBatisUser user) {
        return userMapper.addUser(user);
    }

    @Override
    public int update(Integer id, MyBatisUser user) {
        return userMapper.updateUser(id,user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.deleteUser(id);
    }
}

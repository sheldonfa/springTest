package com.service.impl;

import com.service.UserService;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(String name) {
        userDao.add(name);
    }

    @Override
    public void updateUser() {
        System.out.println("update");

    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }

    @Override
    public void addTest1() {
        addUser("zhangsan");
        int i = 1 / 0;
        addUser("lisi");
    }
}

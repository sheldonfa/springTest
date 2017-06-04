package com.impl;

import com.UserService;
import org.springframework.stereotype.Service;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
@Service
public class UserServiceImpl implements UserService {

//    private UserMapper userMapper;

    @Override
    public void addUser() {
//        userMapper.findUserById(1);
    }

    @Override
    public void updateUser() {
        System.out.println("update");

    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }
}

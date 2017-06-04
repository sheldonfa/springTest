package com.impl;


import com.UserService;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add");
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
    public String selectUser(Integer id) {
        System.out.println("查询一个id为 "+id+" 的家伙");
        return "aaa";
    }
}

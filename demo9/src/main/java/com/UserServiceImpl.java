package com;

import org.springframework.stereotype.Service;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
@Service("userService")
public class UserServiceImpl {

    public void addUser() {
        System.out.println("add");
    }

    public void updateUser() {
        System.out.println("update");

    }

    public void deleteUser() {
        System.out.println("delete");
    }
}

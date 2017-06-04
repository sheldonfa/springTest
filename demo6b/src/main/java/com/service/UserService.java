package com.service;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
public interface UserService {

    void addUser(String name);

    void updateUser();

    void deleteUser();

    /**
     * 事务：添加测试
     */
    void addTest1();
}

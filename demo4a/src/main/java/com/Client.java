package com;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 切面编程
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    /**
     * 前置通知，后置通知
     */
    @Test
    public void test1(){
        String filePath = "beans1.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filePath);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser();
    }

    /**
     * 环绕通知
     */
    @Test
    public void test2(){
        String filePath = "beans2.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filePath);
        UserService userService = context.getBean("userService", UserService.class);
        userService.updateUser();
    }

    /**
     * 带参数配置
     *
     * 这里实现一个带参数的前置通知
     * 其实这些可以用环绕通知解决，jointPoint中有获取参数的方法
     */
    @Test
    public void test3(){
        String filePath = "beans3.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filePath);
        UserService userService = context.getBean("userService", UserService.class);
        userService.selectUser(5);
    }
}

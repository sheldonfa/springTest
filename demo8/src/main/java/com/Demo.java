package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class Demo {

    public static void main(String[] args) {
        String filePath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filePath);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser();
    }
}

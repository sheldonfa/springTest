package com;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 声明bean
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {


    /**
     * 1、setter方式注入bean
     *
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook();
    }

    /**
     * 2、集合注入
     */
    @Test
    public void test2(){
        String filePath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(filePath);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}

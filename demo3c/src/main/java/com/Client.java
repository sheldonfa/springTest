package com;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    /**
     * constructor
     *
     * 根据bean的id名称自动匹配
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Instrumentalist kenny = context.getBean("kenny", Instrumentalist.class);
        kenny.play();
    }
}

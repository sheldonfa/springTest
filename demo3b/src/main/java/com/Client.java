package com;

import com.fither.Fighter;
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
     * byType
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

//    /**
//     * 如果有多个bean匹配，抛异常
//     */
//    @Test
//    public void test2(){
//        String classPath = "beans.xml";
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
//        Fighter fighter = context.getBean(Fighter.class);
//        fighter.fight();
//
//    }


}

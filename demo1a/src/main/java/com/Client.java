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
     * 1、声明一个简单bean
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Juggler juggler = context.getBean("jack", Juggler.class);
        juggler.perform();
    }

    /**
     * 2、构造器声明bean，传参
     *
     * 简单bean使用的是默认构造器声明，有时我们需要为构造器传参
     */
    @Test
    public void test2(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Juggler2 juggler2 = context.getBean("fisher", Juggler2.class);
        juggler2.perform();
    }

    /**
     * 3、构造器，引用类型参数
     *
     * 除了给构造器传递简单类型参数，有时需要传递更复杂的引用类型参数
     */
    @Test
    public void test3(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Fighter fighter = context.getBean("fighter", Fighter.class);
        fighter.fight();
    }


    /**
     * 4、静态工厂
     *
     * 如果实例是单例的，那么构造器将会被完全屏蔽
     */
    @Test
    public void test5(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Earth earth = context.getBean("earth", Earth.class);
        earth.display();
    }

    /**
     * 5、实例工厂
     *
     * 如果是工厂创建实例，构造器同样也会被屏蔽
     */
    @Test
    public void test6(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Car car = context.getBean("car", Car.class);
        car.run();
    }
}

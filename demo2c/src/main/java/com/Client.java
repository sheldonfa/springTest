package com;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean生命周期 init和destroy
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    /**
     * 初始化方法、销毁方法
     *
     * 当bean被实例化后，触发初始化方法
     * 当bean被销毁前，触发销毁方法
     */
    @Test
    public void test1(){
        String classPath = "beans1.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        // init-method是在constructor后执行的，叫postConstructor方法更好
        Stage stage = context.getBean("stage",Stage.class);
        stage.perform();
        // 关闭容器意味着卸载实例
        context.close();

    }

    /**
     * prototype的bean，每次实例化都会触发init方法，但不会触发destroy方法
     */
    @Test
    public void test2(){
        String classPath = "beans2.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Performer performer1 = context.getBean("performer",Performer.class);
        Performer performer2 = context.getBean("performer",Performer.class);
        performer1.perform();
        performer2.perform();
        // 关闭容器意味着卸载实例
        context.close();

    }

}

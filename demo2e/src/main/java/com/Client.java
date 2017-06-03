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
     * 全局配置init方法和destroy方法
     *
     * 如果很多bean有相同的初始化和销毁方法，没有必要一个一个配置
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Stage1 stage1 = context.getBean("stage1", Stage1.class);
        stage1.perform();
        // 关闭容器意味着卸载实例
        context.close();

    }

    /**
     * 如果 全局配置 和 私有配置 并存会怎样？
     *
     * 答：执行私有的，全局配置被屏蔽
     */
    @Test
    public void test2(){
        String classPath = "beans2.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Stage2 stage2 = context.getBean("stage2", Stage2.class);
        stage2.perform();
        // 关闭容器意味着卸载实例
        context.close();

    }
}

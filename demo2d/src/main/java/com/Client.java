package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean生命周期 init和destroy
 *
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    public static void main(String[] args) {
        String classPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Stage stage = context.getBean(Stage.class);
        stage.perform();
        // 关闭容器意味着卸载实例
        context.close();
    }

}

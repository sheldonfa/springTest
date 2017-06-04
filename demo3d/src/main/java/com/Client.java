package com;

import com.test1.Fighter;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义限制器
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {


    /**
     * 多个匹配的bean，会抛异常
     */
    @Test(expected = BeanCreationException.class)
    public void test1(){
        String classPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Fighter fighter = context.getBean(Fighter.class);
        fighter.fight();
    }

}

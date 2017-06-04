package com;

import com.test1.Fighter;
import com.test2.Fighter2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义限制器
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    /**
     * 通过使用qualifier，缩小范围
     *
     * 通过给每个bean添加qualifier，相当于帮他们分组
     * 如果直接使用bean的id，等于转化为byName，这里不掩饰
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Fighter fighter = context.getBean(Fighter.class);
        fighter.fight();
    }

    /**
     * 自定义限定注解@Good
     *
     */
    @Test
    public void test2(){
        String classPath = "beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        Fighter2 fighter = context.getBean(Fighter2.class);
        fighter.fight();
    }
}

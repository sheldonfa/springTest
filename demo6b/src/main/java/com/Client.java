package com;

import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {
    /**
     * 事务自动回滚
     *
     * 两条持久化操作中间抛出异常，结果自动回滚，没有任何一条最终持久化，说明事务配置正确
     */
    @Test(expected = ArithmeticException.class)
    public void test1(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        UserService userService = context.getBean(UserService.class);
        // 添加两条数据，中途抛出异常，自动回滚
        userService.addTest1();
    }
}

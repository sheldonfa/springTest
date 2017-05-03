package spring.demo_10_transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
//@ContextConfiguration(locations={"file:spring/demo_10_transaction/bean.xml"})
public class Demo {

    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        userService.addUser();
    }
}

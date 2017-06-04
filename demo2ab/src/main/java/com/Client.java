package com;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring bean的单多例控制
 * @author fangxin
 * @date 2017/4/22.
 */
public class Client {

    /**
     * spring bean默认都是单例的
     *
     * 获取两个ticket，如果id一样，说明总是获取的同一张ticket
     */
    @Test
    public void test1(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        TicketA ticket1 = context.getBean("ticketA", TicketA.class);
        TicketA ticket2 = context.getBean("ticketA", TicketA.class);
        ticket1.getTicket();
        ticket2.getTicket();

    }

    /**
     * 配置bean为多例，prototype
     *
     */
    @Test
    public void test2(){
        String classPath = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(classPath);
        TicketB ticket1 = context.getBean("ticketB", TicketB.class);
        TicketB ticket2 = context.getBean("ticketB", TicketB.class);
        ticket1.getTicket();
        ticket2.getTicket();

    }
}

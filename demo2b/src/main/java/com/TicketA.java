package com;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
@Component
@Scope("singleton")
public class TicketA {

    private static Integer count=0;

    private Integer id;

    public TicketA() {
        count++;
        id = count;
    }

    public void getTicket(){
        System.out.println("get the ticket with number of "+id);
    }
}

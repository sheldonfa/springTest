package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class TicketB {

    private static Integer count=0;

    private Integer id;

    public TicketB() {
        count++;
        id = count;
    }

    public void getTicket(){
        System.out.println("get the ticket with number of "+id);
    }
}

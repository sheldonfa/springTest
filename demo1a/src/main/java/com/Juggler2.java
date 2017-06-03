package com;


public class Juggler2 {

    private Integer bagCount;

    public Juggler2(Integer bagCount) {
        this.bagCount = bagCount;
    }

    public void perform(){
        System.out.println("juggler is performing，remain "+bagCount+" bags");
    }
}

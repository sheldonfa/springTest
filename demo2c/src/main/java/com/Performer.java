package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class Performer {

    public Performer() {
        System.out.println("Performer Constructor");
    }

    public void run(){
        System.out.println("cat run");
    }

    public void turnOnLights(){
        System.out.println("灯光效果准备完毕");
    }

    public void turnOffLights(){
        System.out.println("关灯收工");
    }

    public void perform(){
        System.out.println("performer perform");
    }
}

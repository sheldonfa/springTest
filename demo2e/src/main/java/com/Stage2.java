package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class Stage2 {

    public Stage2() {
        System.out.println("Stage Constructor");
    }

    public void run(){
        System.out.println("cat run");
    }

    public void turnOnLights(){
        System.out.println("灯光效果准备完毕");
    }

    public void turnOnMyLights(){
        System.out.println("我的灯光效果准备完毕");
    }

    public void turnOffLights(){
        System.out.println("关灯收工");
    }

    public void turnOffMyLights(){
        System.out.println("我的关灯收工");
    }

    public void perform(){
        System.out.println("stage perform");
    }
}

package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class Earth {

    private static Earth earth = new Earth();

    // 私有化构造器
    private Earth() {
    }

    // 实例化
    public static Earth createCar(){
        return earth;
    }

    public void display(){
        System.out.println("im earth");
    }

}

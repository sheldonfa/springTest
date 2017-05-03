package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class CarFactory {

    /**
     * 实例工厂
     * 使用实例工厂方法，必须要创建工厂实例
     */
    public Car getCarInstance(){
        return new Car();
    }

}

package com;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
public class CarFactory {

    private CarFactory() {
    }

    public Car getInstance(){
        return new Car();
    }

}

package com;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author fangxin
 * @date 2017/4/22.
 */
@Component
public class Stage {

    public void run(){
        System.out.println("cat run");
    }

    @PostConstruct
    public void turnOnLights(){
        System.out.println("灯光效果准备完毕");
    }

    @PreDestroy
    public void turnOffLights(){
        System.out.println("关灯收工");
    }

    public void perform(){
        System.out.println("stage perform");
    }
}

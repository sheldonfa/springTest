package com;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
public class MyAspect{

    public void say(){
        System.out.println("hello world");
    }
}

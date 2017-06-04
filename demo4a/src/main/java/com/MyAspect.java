package com;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
public class MyAspect{

    public void beforePoint(){
        System.out.println("im before method");
    }

    public void afterPoint(){
        System.out.println("im after method");
    }

    public void aroundPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前");
        joinPoint.proceed();
        System.out.println("通知后");
    }

    public void beforeWithArgs(Integer id){
        System.out.println("im before with arg:"+id);
    }
}

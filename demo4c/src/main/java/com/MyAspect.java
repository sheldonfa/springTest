package com;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/4/23.
 */
@Component
@Aspect
public class MyAspect{

    @Before(value = "pointCut()")
    public void say(){
        System.out.println("hello world");
    }

    @Pointcut("execution(* com.UserServiceImpl.addUser(..)) " +
            "|| execution(* com.UserServiceImpl.updateUser(..))")
    public String pointCut(){
        System.out.println("yes");
        return "good";
    }

    @After(value = "pointCut()")
    public void after(){
        System.out.println("最终通知");
    }

}

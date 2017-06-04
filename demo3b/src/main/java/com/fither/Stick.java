package com.fither;

import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
@Component
public class Stick implements Weapon {
    public void fight() {
        System.out.println("fighting with stick");
    }
}

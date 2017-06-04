package com.test1;

import com.Weapon;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
@Component
public class Sword implements Weapon {
    public void fight() {
        System.out.println("fighting with sword");
    }
}

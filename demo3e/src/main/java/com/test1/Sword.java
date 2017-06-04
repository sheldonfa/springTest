package com.test1;

import com.Weapon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
@Component
@Qualifier("middle")
public class Sword implements Weapon {
    public void fight() {
        System.out.println("fighting with sword");
    }
}

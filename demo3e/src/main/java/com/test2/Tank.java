package com.test2;

import com.Weapon;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
@Component
@Crazzy
public class Tank implements Weapon {
    public void fight() {
        System.out.println("fighting with tank");
    }
}

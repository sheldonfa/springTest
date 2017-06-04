package com.test2;

import com.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
@Component
public class Fighter2 {

    @Autowired
    @Crazzy
    private Weapon weapon;

    public void fight() {
        weapon.fight();
    }
}

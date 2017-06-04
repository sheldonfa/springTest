package com.test1;

import com.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
@Component
public class Fighter {

    @Autowired
    private Weapon weapon;

    public void fight() {
        weapon.fight();
    }
}

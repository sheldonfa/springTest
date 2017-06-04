package com.fither;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
public class Fighter {

    private Weapon weapon;

    public void fight() {
        weapon.fight();
    }
}

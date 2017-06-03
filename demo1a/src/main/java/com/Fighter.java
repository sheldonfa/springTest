package com;

/**
 * @author fangxin
 * @date 2017/6/3.
 */
public class Fighter {

    private Weapon weapon;

    public Fighter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        System.out.println("soldier is fighting");
        weapon.use();
    }
}

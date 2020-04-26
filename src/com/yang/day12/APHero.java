package com.yang.day12;

public class APHero extends Item implements AP {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}

package com.yang.day12;

public class ADAPHero extends Item implements AP, AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}

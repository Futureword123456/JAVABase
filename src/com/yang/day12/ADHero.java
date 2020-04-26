package com.yang.day12;

public class ADHero extends Item implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击！");
    }
}

package com.yang.day3;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "杨华钟";
        hero.hp = 100.0f;
        hero.armor = 50.0f;
        hero.moveSpeed = 100;
//创建两个对象
        Hero heroo = new Hero();
        heroo.name = "杨华钟o";
        heroo.hp = 1000.0f;
        heroo.armor = 500.0f;
        heroo.moveSpeed = 1000;
    }

}

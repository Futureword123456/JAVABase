package com.yang.day3;

public class Hero1 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    void keng() {
        System.out.println("坑队友!!!");
    }

    //获取护甲
    float getArmor() {
        return armor;
    }

    //增加速度
    void addSpeed(int speed) {
        moveSpeed = moveSpeed + speed;
    }

    void legendary() {
        System.out.println("超神啦！！！");
    }

    //获取当前血量
    float getHp() {
        return hp;
    }

    //回血
    float recovery(float blood) {
        return hp - blood;
    }

    public static void main(String[] args) {
        Hero1 hero1 = new Hero1();
        hero1.name = "杨华钟";
        hero1.moveSpeed = 1000;
        hero1.addSpeed(100);

        System.out.println(hero1.moveSpeed);
    }
}

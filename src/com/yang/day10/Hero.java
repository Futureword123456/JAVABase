package com.yang.day10;

public class Hero {
    String  heroName;
    float heroHP;
    float heroArmor;
    int heroMoveSpeed;

    public Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed) {
        this.heroName = heroName;
        this.heroHP = heroHP;
        this.heroArmor = heroArmor;
        this.heroMoveSpeed = heroMoveSpeed;
    }

    public static void main(String[] args) {
        Hero hero = new Hero("杨华钟",360,300,520);
        System.out.println(hero.heroArmor);

    }
}

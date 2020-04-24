package com.yang.day10;

public class ADHero extends Hello1{
    public void attack(){
        System.out.println(name+"谁对谁攻击了");
    }
    public void attack(Hello1 h){
        System.out.println(name+"对"+h.name+"攻击");
    }
    public void attack(Hello1 h1,Hello1 h2){
        System.out.println(name+"同时对"+h1.name+"和"+h2.name+"攻击");
    }

    public static void main(String[] args) {
        ADHero adHero = new ADHero();
        adHero.name="杨华钟";
        ADHero adHero1 = new ADHero();
        adHero1.name="长江大学";
        ADHero adHero2 = new ADHero();
        adHero2.name="以后就";
        adHero.attack();
        adHero1.attack(adHero1);
        adHero2.attack(adHero1,adHero2);
    }
}

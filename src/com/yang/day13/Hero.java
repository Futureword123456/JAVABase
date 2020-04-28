package com.yang.day13;

public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "霍华德";
        ADHero adHero = new ADHero();
        APHero apHero = new APHero();
        ADAPHero adapHero = new ADAPHero();
        hero.kill(adapHero);
        hero.kill(apHero);
        hero.kill(adHero);

    }

    public void kill(Mortal m) {
        m.die();
        //System.out.println("kill");
    }

}

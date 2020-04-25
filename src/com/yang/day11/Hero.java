package com.yang.day11;

public class Hero extends Item {


    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "杨华钟";
        hero.sername1("一顿饭");
        System.out.println(hero.name);
        hero.sername2("garen");
        System.out.println(hero.name);
        hero.sername3("死歌");
        System.out.println(hero.name);
        System.out.println(hero);
        hero.showAddressInMemory();
    }

    public void showAddressInMemory() {
        System.out.println(this);
    }

    public void sername1(String name) {
        name = name;
    }

    public void sername2(String Hpname) {
        name = Hpname;
    }

    public void sername3(String name) {
        this.name = name;
    }
}

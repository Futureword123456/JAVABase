package com.yang.day14;

public class Hello1 extends Object implements Item {
    String name = null;
    float hp = 0;
    float armor = 0;
    int moveSpeed = 0;

    public Hello1() {
        System.out.println("Hero的无参构造方法！！！！");
    }

    public Hello1(String name) {
        System.out.println("Hero的一个有参数的构造方法！！");
        this.name = name;
    }

    public static void main(String[] args) {
        Hello1 hello1 = new Hello1();
        hello1.name = "杨华钟";
        //默认调用的是无参的构造函数
        System.out.println(hello1);
    }

    public void UseItem(Item i) {
        System.out.println("hero is Item");
        i.effect();

    }

    @Override
    public void effect() {

    }
}

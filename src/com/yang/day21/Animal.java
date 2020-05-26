package com.yang.day21;

public class Animal extends Object {
    public int age = 100;
    public String name;

    public Animal() {
        System.out.println("Animal类执行了");
        //age = 10;
    }

    public void eat() {
        final int i = 50;//常量
        //i=80;
        System.out.println("动物吃东西的能力");
    }
}

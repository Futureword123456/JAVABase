package com.yang.day21;

public class Animal {
    public int age = 20;
    public String name;

    public Animal() {
        System.out.println("Animal类执行了");
        age = 10;
    }

    public void eat() {
        System.out.println("动物吃东西的能力");
    }
}

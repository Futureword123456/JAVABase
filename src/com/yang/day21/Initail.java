package com.yang.day21;

public class Initail {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        dog.age = 10;
        dog1.age = 10;

        if (dog.equals(dog1)) {
            System.out.println("两个对象是相同的");
        } else {
            System.out.println("两个对象是不相同的");
        }
        System.out.println(dog);
    }
}


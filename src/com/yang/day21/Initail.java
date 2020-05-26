package com.yang.day21;

public class Initail {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        System.out.println("animal age:" + animal.age);
        dog.age = 10;
        dog.name = "小狗";
        dog.eat();
    }
}


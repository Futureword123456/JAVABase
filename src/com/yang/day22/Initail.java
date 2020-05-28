package com.yang.day22;

public class Initail {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Animal animal1 = new Dog();//父类的引用指向子类
//        Cat cat = new Cat();
//        animal.eat();
//        animal1.eat();
//        cat.eat();
        Dog dog = new Dog();
        Animal animal = dog;
        if (animal instanceof Dog) {
            Dog dog1 = (Dog) animal;
        } else {
            System.out.println("无法进行类型转换的Dog");
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
        } else {
            System.out.println("无法进行类型转换的Cat");
        }


    }
}

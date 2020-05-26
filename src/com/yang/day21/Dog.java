package com.yang.day21;

public class Dog extends Animal {
    public int age = 40;

    public Dog() {
        // System.out.println();

        System.out.println("Dog类执行了");
    }

    public void eat() {
        System.out.println("狗吃东西的能力");
    }

    public void method() {
        eat();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }


}

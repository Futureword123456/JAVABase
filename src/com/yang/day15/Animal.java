package com.yang.day15;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public Animal() {

    }

    public void walk(int legs) {
        this.legs = 5;
    }

    public abstract void eat();
}

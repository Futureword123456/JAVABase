package com.yang.day15;

public class Spider extends Animal {
    protected Spider(int legs) {
        super();
        this.legs = 8;
    }

    @Override
    public void eat() {
        System.out.println("吃得很多");
    }
}

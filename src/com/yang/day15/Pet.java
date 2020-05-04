package com.yang.day15;

public class Pet extends Animal {
    private String name;

    protected Pet(int legs) {
        super(legs);
    }

    @Override
    public void eat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("玩！！！！");
    }
}

package com.yang.day12;

public class Support extends Item implements Healer {

    @Override
    public void heal() {
        System.out.println("治疗");
    }
}

package com.yang.day15;

public class Hello extends Base {
    public void pyattack() {
        System.out.println("物理攻击");
    }

    @Override

    public void attack() {
        pyattack();
    }
}

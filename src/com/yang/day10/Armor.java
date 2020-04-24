package com.yang.day10;

public class Armor extends Item{
    int ac;

    public static void main(String[] args) {
        Armor armor = new Armor();
        armor.name="布甲";
        armor.price=300;
        armor.ac=15;
        Armor armor1 = new Armor();
        armor1.name="锁子甲";
        armor1.price=500;
        armor1.ac=40;
    }
}

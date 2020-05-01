package com.yang.day14;

public class Hello2 extends Object {
    String name;
    float hp;

    public static void main(String[] args) {
        Hello2 hello2 = new Hello2();
        hello2.name = "杨华钟";
        System.out.println(hello2.toString());
    }

    public String toString() {
        return name;
    }
}

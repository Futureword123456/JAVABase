package com.yang.day25;

public class Test {
    public static void main(String[] args) {
        Chinses chinses = new Chinses();
        American american = new American();
        chinses.say();
        american.say();

        APerson person = new Chinses();
        APerson person1 = new American();
        person.say();
        person1.say();
    }
}

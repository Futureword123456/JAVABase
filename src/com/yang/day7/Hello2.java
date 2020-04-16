package com.yang.day7;

public class Hello2 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 100; i < 999; i++) {
            int g = i % 100 % 10;
            int s = i % 100 / 10;
            int b = i / 100;
            if (i == g * g * g + s * s * s + b * b * b)
                System.out.println(i);
        }
    }
}

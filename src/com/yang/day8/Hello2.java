package com.yang.day8;

public class Hello2 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6};
        int b[] = new int[6];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}

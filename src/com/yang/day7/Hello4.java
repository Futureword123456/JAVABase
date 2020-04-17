package com.yang.day7;

public class Hello4 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
            if (min >= a[i]) {
                min = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("这个数组是" + a[i]);
        }
        System.out.println();
        System.out.println("最小值是" + min);

    }
}

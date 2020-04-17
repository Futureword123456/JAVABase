package com.yang.day7;

public class Hello5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int i = 0;
        int j = 0;
        for (i = 0; i < a.length; i++) {
            System.out.println("前" + a[i]);
        }
        while (i < j) {
            for (i = 0; i < a.length; i++) {
                for (j = a.length - 1; j > 0; j--) {
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (i == j && i > j) {
                    break;
                }
                System.out.println("后" + a[i]);

            }

        }

    }
    //System.out.println("后" + a[i]);
}


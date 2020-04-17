package com.yang.day7;

public class Hello3 {
    public static void main(String[] args) {
        int i, j, k, m;
        for (i = 0; i <= 20; i++) {
            for (j = 0; j <= 20; j++) {
                for (k = 0; k <= 20; k++) {
                    for (m = 0; m <= 20; m++) {
                        if (i + j == 8 && i + k == 14 && j + m == 10 && k - m == 6) {
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(k);
                            System.out.println(m);
                        }
                    }
                }
            }
        }
    }
}

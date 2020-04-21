package com.yang.day8;

public class Hello3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[4];
        int[] c = new int[9];
        System.out.println("数组a的内容：");
        for (int i = 0; i < 5; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("数组b的内容：");
        for (int i = 0; i < 4; i++) {
            b[i] = (int) (Math.random() * 100);
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("数组c的内容：");
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
//        for (int each : c) {
//            System.out.print(each + " ");
//        }

    }
}

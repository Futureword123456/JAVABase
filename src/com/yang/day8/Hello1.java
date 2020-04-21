package com.yang.day8;

public class Hello1 {
    public static void main(String[] args) {
        int values[] = new int[]{12, 15, 1, 16, 18, 19};
//        for (int i = 0; i < values.length; i++) {
//            int each = values[i];
//            System.out.println(each);
//        }
        int max = values[0];
        for (int ea : values) {
            if (ea < max) {
                max = ea;
                System.out.println(max);
            }
        }
    }
}

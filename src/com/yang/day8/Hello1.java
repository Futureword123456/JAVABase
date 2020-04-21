package com.yang.day8;

public class Hello1 {
    public static void main(String[] args) {
        int values[] = new int[]{12, 15, 1, 16, 18, 19};
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.print(each + " ");
        }
        System.out.println();
        int min = values[0];
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];

            }
            if (max < values[i]) {
                max = values[i];

            }
        }
        System.out.println("最小值是:" + min);
        System.out.print("最大值是:" + max);

//        int max = values[0];
////        for (int ea : values) {
////            if (ea < max) {
////                max = ea;
////                System.out.println(max);
////            }
////        }
    }

}

package com.yang.day28;

public class TryCatch {
    public static void main(String[] args) {

    }

    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常了");
            return -1;
        }
        return divider;
    }

    public int test2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常了");
            return result = 999;
        } finally {
            System.out.println("这是finall！！");
            System.out.println("我是result");
        }

    }

    public int test3() {
        int divider = 10;
        int result = 1111;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常了");

        } finally {
            System.out.println("这是finall！！");
            System.out.println("我是result");
        }
        System.out.println("我是test3");
        return 1111;
    }
}

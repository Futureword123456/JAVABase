package com.yang.day18;

public class Hello1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                stringBuffer.append(i);
            } catch (Exception e) {
                System.out.println("内存用满");
                e.printStackTrace();

            }

        }
    }
}

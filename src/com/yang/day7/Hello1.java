package com.yang.day7;

public class Hello1 {
    public static void main(String[] args) {
        int i;
        int j;
        int fenZi = 1;
        int fenMu = 1;
        float l = 1;
        float result = 0.618f;
        for (i = 0; i <= 20; i++) {
            for (j = 0; j <= 20; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    continue;
                float resue1 = (float) i / (float) j;
                float m = resue1 - result;
                m = m < 0 ? 0 - m : m;//取绝对值
                if (m < l) {
                    fenZi = i;
                    fenMu = j;
                    l = m;
                }
            }
        }
        System.out.println(fenZi + "/" + fenMu + "最接近黄金分割点");
    }
}



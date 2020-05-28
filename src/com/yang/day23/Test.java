package com.yang.day23;

public class Test {
    public static void main(String[] args) {
        MianjiandZhouchang mianjiandZhouchang = new Tran();
        System.out.println(mianjiandZhouchang.Area());
        System.out.println(mianjiandZhouchang.Circle());

        System.out.println();
        Tran tran = new Tran();
        System.out.println(tran.Area());
        System.out.println(tran.Circle());

        MianjiandZhouchang mianjiandZhouchang1 = new Cir();
        mianjiandZhouchang1.Area();
        mianjiandZhouchang1.Circle();


    }
}

package com.yang.day9;

import java.util.Arrays;
import java.util.Random;

public class Hello2 {
    public static void main(String[] args) {
    int [][]a=new int[8][5];
        Random r = new Random();
        for (int m=1;m<100;m++){
            for (int i=0;i<8;i++){
                for (int j=0;j<5;j++){
                    a[i][j]=r.nextInt(m);
                }
            }
        }
        PrintArrayA(a);
        int []copy=new int[40];
        for (int i=0;i<8;i++){
            System.arraycopy(a[i],0,copy,i*5,5);
        }
        PrintArrayB(copy);
        Arrays.sort(copy);
        PrintArrayB(copy);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.arraycopy(copy, i*5, a[i], 0, 5);
            }
        }
        PrintArrayA(a);
    }
    public static void PrintArrayA(int a[][]){
        for (int i=0;i<8;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void PrintArrayB(int copy[]){
        System.out.println("复制数组:");
        for (int i=0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
            }
            System.out.println();
        }


    }



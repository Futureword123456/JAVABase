package com.yang.day9;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.SortedMap;

public class Hello1 {
    public static void main(String[] args) {
      int a[]=new int[]{1,3,44,5,6,7,8,9};
      int[] b= Arrays.copyOfRange(a,0,3);
      //for (int i=0;i<b.length;i++){
       //   System.out.print(b[i]+" ");

     // }
        System.out.println("排序之前 :");
        String content=Arrays.toString(a);
        System.out.println(content);
        System.out.println("排序之后:");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,44));
    }

}

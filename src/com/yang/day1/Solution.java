package com.yang.day1;
//问题描述:
//给定一个排序数组，你需要在原地删除重复出现的元素，
//使得每个元素只出现一次，返回移除后数组的新长度。不要使用额外的数组空间，
//你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
public class Solution {
    public static int removeDuplicates(int[] nums) {
     if(nums==null||nums.length==0){
         return 0;
     }else if(nums.length==1){
         return 1;
     }else {
        int temp=nums[0];
        int len=1;
        for(int i=1;i<nums.length;i++){
           if(temp==nums[i]){
               continue;
           }else{
               temp=nums[i];
               nums[len]=nums[i];
               len++;
           }
        }
        return len;
     }

    }

    public static void main(String[] args) {
        int[] nums={0,5,1,2,5,1,5,5,6};
        System.out.println(removeDuplicates(nums));
    }
}
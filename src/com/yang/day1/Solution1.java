package com.yang.day1;
// 这个算法更加巧妙,跟上面的算法有类似的地方,但是这个算法更加简便
/**
 * 数组完成排序后，我们可以放置两个指针 i 和 j，其中 i 是慢指针，而 j 是快指针。只要
 * nums[i]=nums[j],就出现了重复的数据，我们就增加 j 以跳过重复项
 * 当我们遇到 nums[j]≠nums[i] 时，跳过重复项的运行已经结束，因此我们必须把它（nums[j]）的值复
 * 制到 nums[i+1]。然后递增 i，接着我们将再次重复相同的过程，直到 j 到达数组的末尾为止。
 * @param nums
 * @return
 */

public class Solution1 {
    public static int removeTheAgain03(int[] nums){
        if(nums.length==0)
            return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return  i+1;
    }

    public static void main(String[] args) {
        int[] nums={0,1,1,2,5,4,8,6,5,9};
        System.out.println(removeTheAgain03(nums));
    }
}

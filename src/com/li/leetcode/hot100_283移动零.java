package com.li.leetcode;

public class hot100_283移动零 {
    public void moveZeroes(int[] nums) {

        /**
         * 冒泡排序
         */
        for(int i =0;i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
                int temp;
                if(nums[i]==0){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }

        /**
         * 快慢指针
         * 1.lift和right指向同一个位置
         * 2.当right不等于0时，交换左右位置，左右指针右移
         * 3.当right等于0时，左指针不动，右指针右移
         */
        int lift=0,right=0;
     while (right<nums.length){
         if(nums[right]!=0){
             swap(nums,lift,right);
             lift++;
         }
         right++;
     }
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

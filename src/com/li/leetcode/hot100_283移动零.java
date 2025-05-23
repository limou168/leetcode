package com.li.leetcode;

public class hot100_283移动零 {
    public void moveZeroes(int[] nums) {
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
    }
}

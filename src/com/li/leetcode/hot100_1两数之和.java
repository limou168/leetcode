package com.li.leetcode;

public class hot100_1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int[] arr= new int[2];
        for(;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}

package com.li.leetcode;

import java.util.HashSet;
import java.util.Set;

public class hot100_128最长连续序列 {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }
        int ans =1;
        for(Integer i:numbers){
            int temp=1;
            if(!numbers.contains(i-1)){
                while(numbers.contains(i+1)){
                    temp++;
                    i=i+1;
                }
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}

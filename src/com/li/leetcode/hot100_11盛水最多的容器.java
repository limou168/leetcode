package com.li.leetcode;

public class hot100_11盛水最多的容器 {
    /**
     * 左右双指针控制，指针数小的一方移动，保证面积不会越来越小。
     * ans记录最大面积
     * Math.min(height[r],height[l])获取最矮高度，(r-l)为距离
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int ans=0;
        while (l<r){
            int max=Math.min(height[r],height[l])*(r-l);
            ans=Math.max(ans,max);
            if(height[l]<=height[r]){
                ++l;
            }else {
                --r;
            }
        }
        return ans;
    }
}

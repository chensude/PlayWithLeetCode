package com.yt;

import java.util.HashMap;
import java.util.Map;

/**
 * 01-Two Sum
 * hashMap记录(target-num[i],i)
 */
public class Solution {
    public  int[] twoSum(int[] nums, int target) {

        int[] res={0,1};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            if(map.getOrDefault(nums[i],-1)!=-1) {
                res[0]=i;
                res[1]=map.get(nums[i]);
                break;
            }
            map.put(target-nums[i],i);
        }
        return res;
    }
}
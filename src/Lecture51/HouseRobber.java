package Lecture51;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(nums, nums.length-1,dp);
    }
    public int rec(int[] nums, int i, int[] dp){
        if (i<0){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int inc = rec(nums, i-2,dp)+nums[i];
        int exc = rec(nums, i-1,dp);

        return dp[i] = Math.max(inc,exc);
    }
    public int BU(int[] nums){
        if (nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < dp.length; i++) {
            int rob = nums[i]+dp[i-2];
            int notrob = dp[i-1];
            dp[i] = Math.max(rob,notrob);
        }
        return dp[dp.length-1];
    }
}

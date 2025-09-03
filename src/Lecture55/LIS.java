package Lecture55;

import java.util.Arrays;

public class LIS {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < dp.length; i++) {
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}

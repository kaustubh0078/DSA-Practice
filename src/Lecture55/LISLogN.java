package Lecture55;

import java.util.Arrays;

public class LISLogN {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int ans = 1;
        for (int i = 1; i < dp.length; i++) {
            if (nums[i]>dp[ans-1]){
                dp[ans] = nums[i];
                ans++;
            }else {
                int idx = binarySearch(0,ans-1,nums[i],dp);
                dp[idx] = nums[i];
            }
        }

        return ans;
    }
    public int binarySearch(int i, int j, int target, int[] dp){
        int idx = 0;
        while (i<=j){
            int mid = (i+j)/2;
            if (dp[mid]>=target){
                idx = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return idx;
    }
}

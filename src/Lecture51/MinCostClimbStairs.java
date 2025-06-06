package Lecture51;

import java.util.Arrays;

public class MinCostClimbStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int onestep = rec(cost,0,dp);
        int twostep = rec(cost,1,dp);
        return Math.min(onestep,twostep);
    }
    public int rec(int[] cost, int i, int[] dp){

        if (i>cost.length-1){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int twosteps = rec(cost,i+2,dp)+cost[i];
        int onestep = rec(cost,i+1,dp)+cost[i];

        return dp[i] = Math.min(twosteps,onestep);
    }
}

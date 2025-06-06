package Lecture53;

import java.util.Arrays;

public class MinFallingPathSumII {
    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] is: dp){
            Arrays.fill(is,-20001);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            ans = Math.min(ans,rec(grid, 0, i, dp));
        }
        return ans;
    }
    public int rec(int[][] grid, int cr, int cc, int[][] dp){
        if (cc<0 || cc>grid[0].length-1){  //-ve base case
            return Integer.MAX_VALUE;
        }
        if (cr == grid.length-1){  //+ve base case
            return grid[cr][cc];
        }
        if (dp[cr][cc]!=-20001){
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            if (i!=cc){
                ans = Math.min(ans,rec(grid, cr+1, i, dp));
            }
        }
        return dp[cr][cc] = grid[cr][cc] + ans;
    }
}

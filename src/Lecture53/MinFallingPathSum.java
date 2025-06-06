package Lecture53;

import java.util.Arrays;

public class MinFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int[] is: dp){
            Arrays.fill(is,-10001);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans,rec(matrix, 0, i, dp));
        }
        return ans;
    }
    public int rec(int[][] matrix, int cr, int cc, int[][] dp){
        if (cc<0 || cc>matrix[0].length-1){  //-ve base case
            return Integer.MAX_VALUE;
        }
        if (cr == matrix.length-1){  //+ve base case
            return matrix[cr][cc];
        }
        if (dp[cr][cc]!=-10001){
            return dp[cr][cc];
        }
        int ld = rec(matrix, cr+1,cc-1,dp);
        int rd = rec(matrix, cr+1,cc+1,dp);
        int down = rec(matrix, cr+1,cc,dp);

        return dp[cr][cc] = matrix[cr][cc] + Math.min(down,Math.min(rd,ld));
    }
}

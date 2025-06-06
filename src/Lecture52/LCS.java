package Lecture52;

import java.util.Arrays;

public class LCS {
    public int longestCommonSubsequence(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int[] is : dp){
            Arrays.fill(is,-1);
        }
        return rec(s,t,0,0,dp);
    }
    public int rec(String s, String t, int i, int j, int[][] dp){
        if (i==s.length() || j==t.length()){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i)==t.charAt(j)){
            ans = rec(s,t,i+1,j+1,dp)+1;
        }
        else {
            int skipS = rec(s,t,i+1,j,dp);
            int skipT = rec(s,t,i,j+1,dp);
            ans = Math.max(skipT,skipS);
        }
        return dp[i][j] = ans;
    }
    public int BU(String s, String t){
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if (s.charAt(i-1)==t.charAt(j-1)){
                    ans = dp[i-1][j-1] +1;
                }
                else {
                    int skipS = dp[i-1][j];
                    int skipT = dp[i][j-1];
                    ans = Math.max(skipT,skipS);
                }
                dp[i][j] = ans;
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}

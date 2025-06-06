package Lecture53;

import javax.print.DocFlavor;
import java.util.Arrays;

public class EditDistance {
    public int minDistance(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int[] is:dp){
            Arrays.fill(is,-1);
        }
        return rec(s,t,0,0,dp);
    }
    public int rec(String s, String t, int i, int j, int[][] dp){
        if (i==s.length()){
            return t.length()-j;
        }
        if (j==t.length()){
            return s.length()-i;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i)==t.charAt(j)){
            ans = rec(s,t,i+1,j+1,dp);
        }else {
            int I = rec(s,t,i+1,j,dp);
            int D = rec(s,t,i,j+1,dp);
            int R = rec(s,t,i+1,j+1,dp);

            ans = Math.min(I,Math.min(D,R)) + 1;
        }
        return dp[i][j] = ans;
    }
    public int BU(String s, String t){
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 0; i < dp.length; i++) { //row
            dp[i][0] = i;
        }
        for (int i = 0; i < dp[0].length; i++) { //column
            dp[0][i] = i;
        }
        int ans = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s.charAt(i-1)==t.charAt(j-1)){
                    ans = dp[i-1][j-1];
                }else {
                    int I = dp[i-1][j];
                    int D = dp[i][j-1];
                    int R = dp[i-1][j-1];

                    ans = Math.min(I,Math.min(D,R)) + 1;
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

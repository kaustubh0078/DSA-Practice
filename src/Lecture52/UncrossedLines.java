package Lecture52;

public class UncrossedLines {
    public int maxUncrossedLines(int[] s, int[] t) {
        int[][] dp = new int[s.length+1][t.length+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if (s[i-1]==t[j-1]){
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

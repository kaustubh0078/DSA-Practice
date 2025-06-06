package Lecture52;

import java.util.Arrays;

public class CoinChangeII {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length+1];

        for (int[] is: dp){
            Arrays.fill(is, -1);
        }

        return rec(amount, coins, 0,dp);
    }
    public int rec(int amount, int[] arr, int i, int[][] dp){
        if (i==arr.length){
            return 0;
        }
        if (amount==0){
            return 1;
        }
        if (dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int inc = 0;
        int exc = 0;
        if (amount>=arr[i]){
            inc+= rec(amount-arr[i], arr, i,dp);
        }
        exc+=rec(amount,arr,i+1,dp);
        return dp[amount][i] = inc+exc;
    }
    public int BU(int amount, int[] coins){
        int dp[][] = new int[amount+1][coins.length+1];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i]=1;
        }
        for (amount = 1; amount < dp.length; amount++) {
            for (int i = 1; i < dp[0].length; i++) {
                int inc = 0;
                int exc = 0;
                if (amount>=coins[i-1]){
                    inc += dp[amount-coins[i-1]][i];
                }
                exc+= dp[amount][i-1];
                dp[amount][i] = inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

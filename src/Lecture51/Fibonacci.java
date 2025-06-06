package Lecture51;

public class Fibonacci {

    public static void main(String[] args) {
//        System.out.println(fibo(5));
    }
//    public static int fibo(int n){
//        if (n==0 || n==1){
//            return n;
//        }
//        int f1 = fibo(n-1);
//        int f2 = fibo(n-2);
//
//        return f1+f2;
//    }

    public static int memo(int n, int[] dp){
        if (n==0 || n==1){
            return n;
        }
        if (dp[n]!=0){
            return dp[n];
        }
        int f1 = memo(n-1,dp);
        int f2 = memo(n-2,dp);

        return dp[n] = f1+f2;
    }

    public static int BU(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            int f1 = dp[i-1];
            int f2 = dp[i-2];
            dp[i] = f1+f2;
        }
        return dp[n];
    }
}

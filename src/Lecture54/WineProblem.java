package Lecture54;

public class WineProblem {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,5};
        Integer[][] dp = new Integer[arr.length+1][arr.length+1];
        int ans = rec(arr,0,arr.length-1,1,dp);
        System.out.println(ans);
    }
    public static int rec(int[] arr, int i, int j, int year, Integer[][] dp){
        if (i>j){
            return 0;
        }
        if (dp[i][j]!=null){
            return dp[i][j];
        }
        int left = arr[i]*year + rec(arr,i+1,j,year+1,dp);
        int right = arr[j]*year+rec(arr,i,j-1,year+1,dp);
        return dp[i][j] = Math.max(left,right);
    }
}

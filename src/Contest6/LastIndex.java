package Contest6;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int ans = rec(arr,m,0);
        System.out.println(ans);
    }
    public static int rec(int[] arr, int target, int i){
        if (i==arr.length){
            return -1;
        }
        int ans = rec(arr,target,i+1);
        if (ans!=-1){
            return ans;
        } else if (arr[i]==target) {
            return i;
        }else {
            return -1;
        }
    }
}

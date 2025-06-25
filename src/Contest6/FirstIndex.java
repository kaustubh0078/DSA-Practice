package Contest6;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(rec(arr,m,0));
    }
    public static int rec(int[] arr, int target, int i){
        if (i==arr.length){
            return -1;
        }
        int ans = rec(arr,target,i+1);
        if (arr[i]==target){
            return i;
        } else if (ans!=-1) {
            return ans;
        }else {
            return -1;
        }
    }
}

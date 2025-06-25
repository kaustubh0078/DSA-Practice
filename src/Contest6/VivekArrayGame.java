package Contest6;

import java.util.Scanner;

public class VivekArrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            t--;
            System.out.println(rec(0, arr.length-1, arr));
        }
    }
    public static int rec(int start, int end, int[] arr){
        if (start>=end){
            return 0;
        }
        for (int i = start; i < end; i++) {
            int leftSum = sum(start,i,arr);
            int rightSum = sum(i+1,end,arr);

            if (leftSum==rightSum){
                return 1+Math.max(rec(start,i,arr),rec(i+1,end,arr));
            }
        }
        return 0;
    }
    public static int sum(int start, int end, int[] arr){
        int sum=0;
        for (int i = start; i <= end; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}

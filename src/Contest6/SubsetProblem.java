package Contest6;

import java.util.Scanner;

public class SubsetProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int count = rec(arr,m,"",0);
        System.out.println();
        System.out.println(count);
    }
    public static int rec(int[] arr, int m, String ans, int idx){
        if (m==0){
            System.out.print(ans+"  ");
            return 1;
        }
        if (m<0 || idx== arr.length){
            return 0;
        }

        int inc = rec(arr,m-arr[idx],ans+arr[idx]+" ",idx+1);
        int exc = rec(arr,m,ans,idx+1);

        return inc+exc;
    }
}

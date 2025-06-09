package Contest4;

import java.util.Scanner;

public class MaxColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sum(arr);
    }
    public static void sum(int[][] arr){
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i][j];
            }
            if (sum > max) {
                max = sum;
                maxIdx = j;
            }
        }
        System.out.print(maxIdx+1+" ");
        System.out.println(max);
    }
}

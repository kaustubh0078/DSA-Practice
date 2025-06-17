package Practice;

import java.util.Scanner;

public class MaxCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] arr){
        int mult = 1;
        int max = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                mult = arr[i]*arr[j];
                if (max<mult){
                    max = mult;
                    maxSum = arr[i]+arr[j];
                }
            }
        }
        return maxSum;
    }
}

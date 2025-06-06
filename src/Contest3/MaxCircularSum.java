package Contest3;

import java.util.Scanner;

public class MaxCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(result(arr));
            t--;
        }
    }
    public static int kadane(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max = Math.max(sum,max);
            if (sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static int result(int[] arr) {
        int linearMax = kadane(arr);

        // Edge case: All elements are negative
        if (linearMax < 0) return linearMax;

        int totalSum = 0;
        int[] inverted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            inverted[i] = -arr[i];
        }

        int invertedMax = kadane(inverted); // max sum in inverted = -min subarray in original
        int circularMax = totalSum + invertedMax;

        return Math.max(linearMax, circularMax);
    }
}

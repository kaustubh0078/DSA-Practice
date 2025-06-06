package Contest3;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        ans(arr,target);
    }
    public static void ans(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    int[] temp = {arr[i],arr[j]};
                    Arrays.sort(temp);
                    System.out.println(temp[0]+" and "+temp[1]);
                }
            }
        }
    }
}

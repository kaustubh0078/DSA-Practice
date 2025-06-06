package Contest3;

import java.util.Arrays;
import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = reverse(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] reverse(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = index(arr,i);
        }
        return ans;
    }

    public static int index(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

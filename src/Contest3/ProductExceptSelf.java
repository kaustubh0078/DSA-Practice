package Contest3;

import java.util.Arrays;
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = result(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] result(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];

        int[] left = new int[arr.length];
        Arrays.fill(left, 1);
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        int[] right = new int[arr.length];
        Arrays.fill(right, 1);
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        int[] ans = new int[arr.length];
        Arrays.fill(ans,1);
        for (int i = 0; i < ans.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

}

package Contest3;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        int[] ans = add(arr,brr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+", ");
        }
        System.out.print("END");
    }
    public static int[] add(int[] arr, int[] brr){
        int length = Math.max(arr.length, brr.length);
        int[] ans = new int[length+1];
        int carry = 0;
        int i = arr.length-1;
        int j = brr.length-1;
        int k = ans.length-1;

        while (i>=0 || j>=0 || carry!=0){
            int digitA;
            int digitB;
            if (i>=0){
                digitA = arr[i];
            }else {
                digitA = 0;
            }
            if (j>=0) {
                digitB = brr[j];
            }else {
                digitB = 0;
            }

            int sum = digitA+digitB+carry;
            ans[k] = sum%10;
            carry = sum/10;
            i--;
            j--;
            k--;
        }
        if (ans[0] == 0) {
            return Arrays.copyOfRange(ans, 1, ans.length);
        }
        return ans;
    }
}

package Contest3;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumArray {
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
        int[] ans = new int[arr.length];
        Arrays.fill(ans,1);
        ans[0] = arr[0];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}

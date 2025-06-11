package Contest4;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,c));
    }
    public static int binarySearch(int[] arr, int c){
        int i = 1;
        int j = arr[arr.length-1]-arr[0];
        int ans = 0;
        while (i<=j){
            int mid = (i+j)/2;
            if (isPossible(arr,c,mid)){
                ans = mid;
                i = mid+1;
            }else {
                j= mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr, int c, int mid){
        int li = 0;
        int cpsf = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-arr[li]>=mid){
                li = i;
                cpsf++;
            }
            if (cpsf==c){
                return true;
            }
        }
        return false;
    }
}

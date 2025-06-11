package Contest4;

import java.util.Scanner;

public class PainterPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // no of painters
        int n = sc.nextInt(); // no of boards
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr,k));
    }
    public static int binarySearch(int[] arr, int k){
        int i = 1;
        int j = total(arr);
        int ans = 0;
        while (i<=j){
            int mid = (i+j)/2;
            if (isPossible(arr,k,mid)){
                j = mid-1;
                ans = mid;
            }else {
                i = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr, int k, int maxTime){
        int usedPainters = 1;
        int timeSpent = 0;
        for (int i = 0; i < arr.length; ) {
            if (timeSpent+arr[i]<=maxTime){
                timeSpent = timeSpent+arr[i];
                i++;
            }else {
                usedPainters++;
                timeSpent = 0;
            }
            if (usedPainters>k){
                return false;
            }
        }
        return true;
    }
    public static int total(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}

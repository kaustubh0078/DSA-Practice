package Contest4;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int m = sc.nextInt();
            int nos = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(binarySearch(arr,nos));
            t--;
        }
    }
    public static int binarySearch(int[] arr, int nos){
        int i = 1;
        int j = total(arr);
        int ans = 0;
        while (i<=j){
            int mid = (i+j)/2;
            if (isPossible(arr,nos, mid)){
                j = mid-1;
                ans = mid;
            }else {
                i = mid+1;
            }
        }
        return ans;
    }
    public static int total(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean isPossible(int[] arr, int nos, int mid){
        int s = 1;
        int no_of_pages_read = 0;
        for (int i = 0; i < arr.length;) {
            if (no_of_pages_read+arr[i]<=mid){
                no_of_pages_read += arr[i];
                i++;
            }else{
                s++;
                no_of_pages_read = 0;
            }
            if (s>nos){
                return false;
            }
        }
        return true;
    }
}

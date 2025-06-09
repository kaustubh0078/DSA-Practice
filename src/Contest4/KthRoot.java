package Contest4;

import java.util.Scanner;

public class KthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            long n = sc.nextLong();
            int k = sc.nextInt();
            t--;
            System.out.println(binarySearch(n,k));
        }
    }
    public static long binarySearch(long n, int k){
        long i = 1;
        long j = n;
        long ans = 0;
        while (i<=j){
            long mid = (i+j)/2;
            if (Math.pow(mid,k)<=n){
                ans = mid;
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        return ans;
    }
}

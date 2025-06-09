package Contest4;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = 1;
        long j = n;
        long ans = 0;
        while (i<=j){
            long mid = (i+j)/2;
            if (mid*mid<=n){
                ans = mid;
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
        System.out.println(ans);
    }
}

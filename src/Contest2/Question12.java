package Contest2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n==0){
            System.out.println(5);
        }else {
            long ans = 0;
            int place = 0;
            while (n > 0) {
                long rem = n % 10;
                if (rem == 0) {
                    ans = ans + 5 * (long) Math.pow(10, place);
                } else {
                    ans = ans + rem * (long) Math.pow(10, place);
                }
                place++;
                n = n / 10;
            }
            System.out.println(ans);
        }
    }
}

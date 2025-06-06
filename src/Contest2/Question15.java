package Contest2;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            int ans = 0;
            int copy = i;
            int place = noOfDigits(i);

            while (copy>0){
                int rem = copy%10;
                ans = ans+(int)Math.pow(rem,place);
                copy=copy/10;
            }
            if (ans==i) {
                System.out.println(ans);
            }
        }

    }
    public static int noOfDigits(int n){
        int place = 0;
        while (n>0){
            n = n/10;
            place++;
        }
        return place;
    }
}

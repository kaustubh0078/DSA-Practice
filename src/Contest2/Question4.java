package Contest2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        int place = 0;
        while (n>0){
            int digit = n%10;
            ans = ans+(int)(digit*Math.pow(2,place));
            n = n/10;
            place++;
        }
        System.out.println(ans);
    }
}

package Contest2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int place = 1;
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans = ans+(int)(place*Math.pow(10,rem-1));
            n = n/10;
            place++;
        }
        System.out.println(ans);
    }
}

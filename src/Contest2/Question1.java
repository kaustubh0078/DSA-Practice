package Contest2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = 0;
        int ans2 = 0;
        int place = 1;
        while (n>0){
            int rem = n%10;
            if (place%2==0){
                ans2 = ans2+rem;
            }else{
                ans1 = ans1+rem;
            }
            n = n/10;
            place++;
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
}

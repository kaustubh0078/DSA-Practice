package Contest2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans = ans*10+rem;
            n = n/10;
        }
        System.out.println(ans);
    }
}

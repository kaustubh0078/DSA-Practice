package Contest2;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        for (int i = 0; i < n; i++) {
            n1 = sc.nextInt();
            int ans1 = 0;
            int ans2 = 0;
            while (n1>0){
                int rem = n1%10;
                if (rem%2==0){
                    ans2 = ans2+rem;
                }else{
                    ans1 = ans1+rem;
                }
                n1 = n1/10;
            }
            if (ans1%3==0 || ans2%4==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}

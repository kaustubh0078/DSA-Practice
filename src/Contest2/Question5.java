package Contest2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lcm = (n*m)/gcd(n,m);
        System.out.println(lcm);
    }
    public static int gcd(int n, int m){
        while (n%m>0){
            int rem = n%m;
            n = m;
            m = rem;
        }
        return m;
    }
}

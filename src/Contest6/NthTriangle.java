package Contest6;

import java.util.Scanner;

public class NthTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rec(n));
    }
    public static int rec(int n){
        if (n==1){
            return 1;
        }
        int sum = n+rec(n-1);
        return sum;

    }
}

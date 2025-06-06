package Contest1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int a = 0;
        int b = 1;
        while (row<=n){
            int cst = 0;
            while (cst<nst){
                int fibo = a+b;
                System.out.print(a+" ");
                a = b;
                b = fibo;
                cst++;
            }
            row++;
            nst++;
            System.out.println();
        }
    }
}

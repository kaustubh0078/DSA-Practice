package Contest1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n/2;
        while (row<=n){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst){
                System.out.print("* ");
                cst++;
            }
            if (row<=n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
            row++;
            System.out.println();
        }
    }
}

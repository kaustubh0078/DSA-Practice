package Contest1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp1 = n-1;
        int nsp2 = n-2;
        int nst = n;
        int nst2 = 1;
        while (row<=n){
            int csp = 0;
            while (csp<nsp1){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst){
                if (row==1 || row==n){
                    System.out.print("*");
                }else {
                    int cst2 = 0;
                    while (cst2<nst2){
                        System.out.print("* ");
                        cst2++;

                    }
                    cst+=n-3;
                    int csp2 = 0;
                    while (csp2<nsp2){
                        System.out.print(" ");
                        csp2++;
                    }

                }
                cst++;
            }
            row++;
            nsp1--;
            System.out.println();
        }
    }
}

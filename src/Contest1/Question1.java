package Contest1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n/2+1;
        int nsp = -1;
        while (row<=n){
            int cst1=0;
            while (cst1<nst){
                System.out.print("* ");
                cst1++;
            }
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst2 = 0;
            if (row==1 || row==n){
                cst2++;
            }
            while (cst2<nst){
                System.out.print("* ");
                cst2++;
            }
            System.out.println();
            if (row<=n/2){
                nst--;
                nsp+=2;
            }else {
                nst++;
                nsp-=2;
            }
            row++;
        }
    }
}

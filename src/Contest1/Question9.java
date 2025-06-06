package Contest1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = 2*n-3;

        while (row<=n){
            int cst1 = 0;
            int val = 1;
            while (cst1<nst){
                System.out.print(val+" ");
                cst1++;
                val++;
            }
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            if (val==n+1){
                val-=2;
            }else{
                val--;
            }
            int cst2 = 0;
            if (row==n){
                cst2++;
            }
            while (cst2<nst){
                System.out.print(val+" ");
                cst2++;
                val--;
            }
            row++;
            nst++;
            nsp-=2;
            System.out.println();
        }
    }
}

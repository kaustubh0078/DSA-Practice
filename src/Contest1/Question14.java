package Contest1;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = 2*n-1;
        int val = n;
        while (row<=2*n+1){
            int cst1 = 0;
            while (cst1<nst){
                System.out.print(val+" ");
                cst1++;
                if (cst1!=nst){
                    val--;
                }
            }
            if (row==n+1){
                val++;
            }
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst2 = 0;

            if (row==n+1){
                cst2++;
            }
            while (cst2<nst){
                System.out.print(val+" ");
                cst2++;
                if (cst2!=nst){
                    val++;
                }
            }
            if (row<=n){
                nst++;
                nsp-=2;
            }else{
                nst--;
                nsp+=2;
            }
            row++;
            System.out.println();
        }
    }
}

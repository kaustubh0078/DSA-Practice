package Contest1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp1 = n-1;
        int nsp2 = -1;
        int val = 1;
        while (row<=n){
            int csp1 = 0;
            while (csp1<nsp1){
                System.out.print("  ");
                csp1++;
            }
            int cst1 = 0;
            while (cst1<nst){
                System.out.print(val+" ");
                if (cst1!=nst-1){
                    val--;
                }
                cst1++;
            }
            int csp2 = 0;
            while (csp2<nsp2){
                System.out.print("  ");
                csp2++;
            }
            int cst2 = 0;
            if (row==1||row==n){
                cst2++;
            }
            while (cst2<nst){
                System.out.print(val+" ");
                if (cst2!=nst-1){
                    val++;
                }
                cst2++;
            }
            if (row<=n/2){
                nst++;
                nsp1-=2;
                nsp2+=2;
                val++;
            }else{
                nst--;
                nsp1+=2;
                nsp2-=2;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}

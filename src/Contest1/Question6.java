package Contest1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        int val = 1;
        while (row<=2*n-1){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;

            while (cst<nst){
                System.out.print(val+" ");
                if (cst<nst/2){
                    val++;
                }else{
                    val--;
                }
                cst++;
            }
            if (row<=n-1){
                nst+=2;
                nsp--;
                val+=2;
            }else{
                nst-=2;
                nsp++;
            }
            row++;
            System.out.println();
        }
    }
}

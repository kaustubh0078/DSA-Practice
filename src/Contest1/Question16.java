package Contest1;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 2*n+1;
        int nsp = 0;
        int val = n;
        while (row<=2*n+1){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst){
                System.out.print(val+" ");
                if (cst<nst/2){
                    val--;
                }else{
                    if (cst!=nst-1){
                        val++;
                    }
                }
                cst++;
            }
            if (row<=n){
                nst-=2;
                nsp++;
                val--;
            }else{
                nst+=2;
                nsp--;
                val++;
            }
            row++;
            System.out.println();
        }
    }
}

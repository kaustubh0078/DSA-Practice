package Contest1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n-1;

        while (row<=n){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            int val = row;
            while (cst<nst){
                System.out.print(val+" ");
                if (cst<row-1){
                    val++;
                }else{
                    val--;
                }
                cst++;
            }
            nsp--;
            nst+=2;
            row++;
            System.out.println();
        }
    }
}

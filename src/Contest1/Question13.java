package Contest1;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int nst = 1;
        while (row<n){
            int cst = 0;
            int val = 1;
            while (cst<nst){
                System.out.print(val+" ");
                val = val*(row-cst)/(cst+1);
                cst++;
            }
            row++;
            nst++;
            System.out.println();
        }
    }
}

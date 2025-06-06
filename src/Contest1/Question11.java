package Contest1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        while (row<=2*n-1){
            int cst = 0;
            while (cst<nst){
                if (row%2==0){
                    System.out.println();
                    break;
                }else {
                    System.out.print("* ");
                }
                cst++;
            }
            if (row%2!=0){
                System.out.println();
            }

            if (row%2!=0){
                nst++;
            }
            row++;


        }
    }
}

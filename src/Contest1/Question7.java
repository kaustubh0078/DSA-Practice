package Contest1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int val = 1;
        while (row<=n){
            int cst = 0;
            while (cst<nst){
                if (row>2){
                    if (cst==0 || cst==row-1){
                        System.out.print(val+" ");
                    }else{
                        System.out.print(0+" ");
                    }
                }else{
                    System.out.print(val+" ");
                }
                cst++;
            }
            val++;
            row++;
            nst++;
            System.out.println();
        }
    }
}

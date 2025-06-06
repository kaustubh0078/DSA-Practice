package Lecture3;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;
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
                if (cst == 0 || cst ==nst-1){
                    System.out.print(val+" ");
                }else {
                    System.out.print(0+ " ");
                }
                cst++;
            }
            System.out.println();
            row++;
            nst+=2;
            nsp--;
        }
    }
}

package Lecture3;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int nst = 1;
        int nsp = n/2;
        while (row<=n){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            if(row<=n/2+1){
                nsp--;
                nst+=2;
            }else {
                nsp++;
                nst-=2;
            }
        }
    }
}

package Lecture2;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = 1;
        int nsp = n-1;
        while (rows<=n){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst){
                if (cst%2==0){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                cst++;
            }
            rows++;
            nst+=2;
            nsp--;
            System.out.println();
        }
    }
}

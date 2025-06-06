package Lecture2;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst =(n*2)-1;
        int nsp = 0;
        while (rows<=n){
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
            rows++;
            nst-=2;
            nsp++;
        }
    }
}

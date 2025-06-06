package Lecture2;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = n;
        int nsp = n-2;
        while (rows<=n){
            if (rows==1 || rows==n){
                int cst = 0;
                while (cst<nst){
                    System.out.print("* ");
                    cst++;
                }
            }else{
                System.out.print("* ");
                int csp = 0;
                while (csp<nsp){
                    System.out.print("  ");
                    csp++;
                }
                System.out.print("* ");
            }
            System.out.println();
            rows++;
        }
    }
}

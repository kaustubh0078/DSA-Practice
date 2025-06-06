package Lecture2;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = 1;
        int nsp = n - 1;   //No of space
        int val = 1;
        while (rows<=n){
            int csp = 0;   //Count of space
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst){
                System.out.print(val+" ");
                cst++;
                val++;
            }
            System.out.println();
            rows++;
            nst+=2;
            nsp--;
        }
    }
}

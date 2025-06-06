package Lecture2;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = n;
        while (rows<=n){
            int cst = 0;
            while (cst<nst){
                System.out.print("* ");
                cst++;
            }
            rows++;
            nst--;
            System.out.println();
        }
    }
}

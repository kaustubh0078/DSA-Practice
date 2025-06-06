package Lecture2;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst =n;
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
            nst--;
            nsp+=2;  //main change from previous pattern ie pattern 5
        }
    }
}

package Lecture3;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int row =1;
        int nst = 1;
        while (row<=2*n-1){
            int cst = 0;
            while (cst<nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            if (row<=n){
                nst++;
            }
            else {
                nst--;
            }
        }
    }
}

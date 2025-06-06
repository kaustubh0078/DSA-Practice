package Lecture3;

public class Pattern27 {
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
            int val = 1;
            while (cst<nst){
                System.out.print(val+" ");
                if (cst<nst/2){
                    val++;
                }else {
                    val--;
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

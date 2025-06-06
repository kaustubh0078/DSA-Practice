package Lecture3;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = 1;
        int nsp = n - 1;   //No of space
        while (rows <= n) {
            int csp = 0;   //Count of space
            while (csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            int val = rows;
            while (cst < nst) {
                System.out.print(val + " ");
                if (cst<nst/2){
                    val++;
                }else {
                    val--;
                }
                cst++;

            }
            System.out.println();
            rows++;
            nst += 2;
            nsp--;
        }
    }
}

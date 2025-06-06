package Lecture4;

public class Pattern33 {
    public static void main(String[] args) {
        int n = 10;
        int row = 1;
        int nst = 1;
        int nsp = n-1;
        int val =n;
        while (row<=n){
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst<nst) {
                if (cst==row-1){
                    System.out.print("0"+" ");
                    val--; // eventhough val is not printed but it needs to be changed
                }
                else {
                    System.out.print(val+" ");
                    if (cst<row-1){
                        val++;
                    }
                    else{
                        val--;
                    }

                }
                cst++;
            }
            row++;
            nst+=2;
            nsp--;
            System.out.println();

        }
    }
}

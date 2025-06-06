package Lecture4;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp1 = 0;
        int nsp2 = n-2;
        while (row<=n){
            int csp1=0;
            while (csp1<nsp1){
                System.out.print("   ");
                csp1++;
            }
            int cst = 0;
            while (cst<nst){
                System.out.print("*  ");
                cst++;
            }
            int csp2=0;
            while (csp2<nsp2){
                System.out.print("   ");
                csp2++;
            }
            int cst2 = 0;
            if (row==n/2+1){
                cst2++;
            }
            while (cst2<nst){
                System.out.print("* ");
                cst2++;
            }
            row++;
            System.out.println();
            if (row<=n/2+1){
                nsp1++;
                nsp2-=2;
            }else {
                nsp1--;
                nsp2+=2;
            }
        }
    }
}

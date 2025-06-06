package Lecture3;

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = n;
        while (row<=n){
            int cst = 0;
            int val = n;
            while (cst<nst){
                System.out.print(val+" ");
                cst++;
                val--;
            }
            System.out.println();
            row++;
        }
    }
}

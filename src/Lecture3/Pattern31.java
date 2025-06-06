package Lecture3;

public class Pattern31 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = n;

        while (rows <= n) {
            int val = n;
            int cst = 0;
            while (cst < nst) {
                if (cst == n - rows) {  //or it will also work for val==row
                    System.out.print("*");
                } else {
                    System.out.print(val);
                }
                cst++;
                val--;
            }
            rows++;
            System.out.println();
        }
    }
}

package Lecture2;

class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1;
        int nst = n; //no of stars
        while (rows<=n){
            int cst = 0;  // count of stars
            while (cst<nst){
                System.out.print("* ");
                cst++;
            }
            rows = rows+1;
            System.out.println();
        }
    }
}

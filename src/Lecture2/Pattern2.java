package Lecture2;
// initial row me kitne stars hai
public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int rows = 1; //row no 1
        int nst = 1;  //no of stars
        while (rows<=n){
            int cst = 0;  //count of stars
            while (cst<nst){
                System.out.print("* ");
                cst++;
            }
            nst++;
            rows++;
            System.out.println();
        }
    }
}

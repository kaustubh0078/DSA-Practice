package Lecture4;

class Pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst1 = n;
        int nst2 = n;
        int nsp = -1;
        while (row<=n){
            int cst1=0;
            while (cst1<nst1){
                System.out.print("* ");
                cst1++;
            }
            int csp = 0;
            while (csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int cst2=0;
            if (row==1){
                cst2++;
            }
            while (cst2<nst2){
                System.out.print("* ");
                cst2++;
            }
            row++;
            System.out.println();
            nst1--;
            nst2--;
            nsp+=2;
        }
    }
}

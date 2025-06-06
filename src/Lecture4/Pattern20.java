package Lecture4;

class Pattern20 {
    public static void main(String[] args) {
        int n = 7;
        int row = 1;
        int nst = 1;
        int nsp1 = n/2;
        int nsp2= -1;
        while (row<=n){
            int csp1 = 0;
            while (csp1<nsp1){
                System.out.print("   ");
                csp1++;
            }
            if (row==1 || row==n){
                System.out.print("*  ");
            }else {
                int cst = 0;
                while (cst < nst) {
                    System.out.print("*  ");
                    cst++;
                }
            }
            int csp2 = 0;
            while (csp2<nsp2){
                System.out.print("   ");
                csp2++;
            }
            if (row==1 || row==n){

            }else {
                int cst = 0;
                while (cst < nst) {
                    System.out.print("*  ");
                    cst++;
                }
            }

            row++;
            System.out.println();
            if (row<=n/2+1){

                nsp1--;
                nsp2+=2;
            }else {

                nsp1++;
                nsp2-=2;
            }
        }
    }
}

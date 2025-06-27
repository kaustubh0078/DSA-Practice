package Contest6;

import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("0 ");
        for (int i = 1; i <= 9; i++) {
            rec(i,n);
        }
    }
    public static void rec(int curr, int n){
        if (curr>n){
            return;
        }
        System.out.print(curr+" ");
        for (int i = 0; i <= 9; i++) {
            int a = curr*10+i;
            if (a<=n){
                rec(a,n);
            }
        }
    }
}

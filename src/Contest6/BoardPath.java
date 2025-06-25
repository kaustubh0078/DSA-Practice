package Contest6;

import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = rec(n,m,"");
        System.out.println();
        System.out.println(count);
    }
    public static int rec(int n, int m, String ans){
        int count = 0;
        if (n==0){
            System.out.print(ans+" ");
            return 1;
        }
        for (int i = 1; i <= m; i++) {
            if (n<0){
                return 0;
            }
            count+=rec(n-i,m,ans+i);
        }
        return count;
    }
}

package Contest6;

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = rec(n,m,"");
        System.out.println();
        System.out.println(count);
    }
    public static int rec(int row, int col, String ans){
        if (row==1 && col==1){
            System.out.print(ans+" ");
            return 1;
        }
        if (row<1 || col<1){
            return 0;
        }
        int v = rec(row-1,col,ans+"V");
        int h = rec(row,col-1,ans+"H");
        return v+h;
    }
}

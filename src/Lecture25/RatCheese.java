package Lecture25;

import java.util.Scanner;

public class RatCheese {
    static boolean flag = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];
        for (int i = 0; i < board.length; i++) {
            String s = sc.next();
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        rec(board, ans, 0,0,n,m);
        if (flag){
            System.out.println("NO PATH FOUND");
        }
    }
    public static void rec(int[][] board, int[][] ans, int cr, int cc, int n, int m){
        if (cr==n-1 && cr==m-1 && board[cr][cc]!='X') {  //last element pe X na ho
            flag = false;
            ans[cr][cc]= 1;
            display(ans);
            ans[cr][cc]= 0;
            return;
        }
        if (cr<0 || cr>=n || cc<0 || cc>=m || board[cr][cc]=='X'){
            return;
        }
        ans[cr][cc]=1;
        board[cr][cc] = 'X';

        rec(board,ans,cr+1,cc,n,m);  //down
        rec(board,ans,cr,cc+1,n,m);  //right
        rec(board,ans,cr-1,cc,n,m);  //up
        rec(board,ans,cr,cc-1,n,m);  //left

        board[cr][cc] = '0';  //Backtrack
        ans[cr][cc] = 0;  //For Multiple Solutions
    }
    public static void display(int[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}

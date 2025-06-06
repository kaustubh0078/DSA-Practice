package Lecture22;

public class Maze {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        rec(1,1,n,m,"");
    }
    public static void rec(int row, int col, int n, int m, String ans){
        if (row==n && col==m){
            System.out.println(ans);
            return;
        }
        if (row>n || col>m){
            return;
        }
        rec(row+1,col,n,m,ans+"V");
        rec(row,col+1,n,m,ans+"H");
    }
}

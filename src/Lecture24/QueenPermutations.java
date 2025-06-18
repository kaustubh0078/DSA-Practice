package Lecture24;

public class QueenPermutations {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        rec(0,tq,board,"");
    }
    public static void rec(int qpsf, int tq, boolean[] board, String ans){
        if (qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i]==false){
                board[i] = true;
                rec(qpsf+1,tq,board,ans+"q"+qpsf+"b"+i);
                board[i] = false;  //backtracking
            }
        }
    }
}

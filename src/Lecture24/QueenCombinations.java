package Lecture24;

public class QueenCombinations {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        rec(0,tq,board,"",0);
    }
    public static void rec(int qpsf, int tq, boolean[] board, String ans, int si){
        if (qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = si; i < board.length; i++) {
            if (board[i]==false){
                board[i] = true;
                rec(qpsf+1,tq,board,ans+"q"+"b"+i,i+1);
                board[i] = false;  //backtracking
            }
        }
    }
}

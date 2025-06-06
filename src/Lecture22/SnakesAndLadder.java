package Lecture22;

public class SnakesAndLadder {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        rec(0,n,"",m);
    }
//    public static void rec(int st, int end, String ans){
//        if (st==end){
//            System.out.println(ans);
//            return;
//        }
//        if (st>end){
//            return;
//        }
//        rec(st+1,end,ans+"1");
//        rec(st+2,end,ans+"2");
//        rec(st+3,end,ans+"3");
//    }
    public static void rec(int st, int end, String ans, int m){
        if (st==end){
            System.out.println(ans);
            return;
        }
        if (st>end){
            return;
        }
        for (int i = 1; i <= m; i++) {
            rec(st+i,end,ans+i,m);
        }
    }
}

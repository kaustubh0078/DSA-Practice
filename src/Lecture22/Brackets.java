package Lecture22;

public class Brackets {
    public static void main(String[] args) {
        rec(3,3,"");
    }
    public static void rec(int op, int cl, String ans){
        if (op<0 || cl<0){
            return;
        }
        if (op==0 && cl==0){
            System.out.println(ans);
            return;
        }
        rec(op-1,cl,ans+"(");
        if (op<cl){
            rec(op,cl-1,ans+")");
        }
    }
}

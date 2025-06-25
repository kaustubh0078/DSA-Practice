package Contest6;

import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n,n,"");
    }
    public static void rec(int op, int cl, String ans){
        if (op==0 && cl==0){
            System.out.println(ans);
            return;
        }
        if (op<0 || cl<0){
            return;
        }
        rec(op-1,cl,ans+"(");
        if (op<cl){
            rec(op,cl-1,ans+")");
        }
    }
}

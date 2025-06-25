package Contest6;

import java.util.Scanner;

public class ReplaceZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        rec(s,"",0);
    }
    public static void rec(String s, String ans, int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        if (s.charAt(i)=='0'){
            rec(s,ans+'5',i+1);
        }else {
            rec(s,ans+ch,i+1);
        }
    }
}

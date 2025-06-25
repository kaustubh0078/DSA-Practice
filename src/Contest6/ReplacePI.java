package Contest6;

import java.util.Scanner;

public class ReplacePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            String s = sc.next();
            rec(s,"",0);
            t--;
        }
    }
    public static void rec(String s, String ans,int i){
        if (i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        if (s.charAt(i)=='p'){
            if (s.charAt(i+1)=='i'){
                char sh = s.charAt(i+1);
                rec(s,ans+ "3.14",i+2);
            }else {
                rec(s,ans+ch,i+1);
            }
        }else {
            rec(s,ans+ch,i+1);
        }
    }
}

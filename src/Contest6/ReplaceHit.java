package Contest6;

import java.util.Scanner;

public class ReplaceHit {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s,0));
        rec(s,"",0);
        rec2(s,"",0);
    }
    public static void rec(String s, String ans, int i){
        if (i>s.length()-2){
            System.out.println(ans);
            return;
        }
        if (s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            if (i+2>=s.length() || s.charAt(i+2)!='t') {
                rec(s, ans, i + 2);
            }else {
                rec(s,ans+s.charAt(i),i+1);
            }
        }else {
            rec(s,ans+s.charAt(i),i+1);
        }
    }
    public static void rec2(String s, String ans, int i){
        if (i>s.length()-2){
            System.out.println(ans);
            return;
        }
        if (s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            if (i+2>=s.length() || s.charAt(i+2)!='t') {
                rec2(s, ans + "bye", i + 2);
            }else {
                rec2(s,ans+s.charAt(i),i+1);
            }
        }else {
            rec2(s,ans+s.charAt(i),i+1);
        }
    }
    public static int count(String s, int i){
        if (i>s.length()-2){
            return ans;
        }
        if (s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            if (i+2>=s.length() || s.charAt(i+2)!='t') {
                count(s,i+2);
                ans++;
            }else {
                count(s,i+1);
            }
        }else {
            count(s,i+1);
        }
        return ans;
    }
}

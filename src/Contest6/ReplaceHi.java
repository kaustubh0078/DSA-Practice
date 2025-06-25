package Contest6;

import java.util.Scanner;

public class ReplaceHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = rec3(s,0,0);
        System.out.println(ans);
        rec1(s,"",0);
        rec2(s,"",0);
    }
    public static void rec1(String s, String ans,int i){
        if (i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        if (s.charAt(i)=='h' && i+1 < s.length()){
            if (s.charAt(i+1)=='i'){
                rec1(s,ans,i+2);
            }else {
                rec1(s,ans+ch,i+1);
            }
        }else {
            rec1(s,ans+ch,i+1);
        }
    }
    public static void rec2(String s, String ans,int i){
        if (i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        if (s.charAt(i)=='h' && i+1 < s.length()){
            if (s.charAt(i+1)=='i'){
                rec2(s,ans+"bye",i+2);
            }else {
                rec2(s,ans+ch,i+1);
            }
        }else {
            rec2(s,ans+ch,i+1);
        }
    }
    public static int rec3(String s, int i, int count){
        if (i>=s.length()-1){
            return count;
        }
        if (s.charAt(i)=='h'){
            if (s.charAt(i+1)=='i'){
                return rec3(s,i+2,count+1);
            }
        }
        return rec3(s,i+1,count);
    }
}

package Contest6;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(rec(s,0,0));
    }
    public static int rec(String s, int ans, int i){
        if (i==s.length()){
            return ans;
        }
        int ch = s.charAt(i)-'0';
        return rec(s,(ans*10)+ch,i+1);
    }
}

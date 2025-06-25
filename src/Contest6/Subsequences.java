package Contest6;

import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = rec(s,"",0);
        System.out.println();
        System.out.println(count);
    }
    public static int rec(String s, String ans, int i){
        if (i==s.length()){
            System.out.print(ans+" ");
            return 1;
        }
        char ch = s.charAt(i);
        int inc = rec(s,ans+ch,i+1);
        int exc = rec(s,ans,i+1);
        return inc+exc;
    }
}

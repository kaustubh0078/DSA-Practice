package Contest6;

import java.util.Scanner;

public class KeypadCodes {
    static String code[] = {
            "",       //0
            "abc",    //1
            "def",    //2
            "ghi",    //3
            "jkl",    //4
            "mno",    //5
            "pqrs",   //6
            "tuv",    //7
            "wx",     //8
            "yz"      //9
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = rec(s,"",0);
        System.out.println();
        System.out.println(count);
    }
    public static int rec(String s, String ans, int i){
        int count = 0;
        if (i==s.length()){
            System.out.print(ans+" ");
            return 1;
        }
        char digit = s.charAt(i);
        String t = code[digit-'0'];

        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);
            count += rec(s,ans+ch,i+1);
        }
        return count;
    }
}

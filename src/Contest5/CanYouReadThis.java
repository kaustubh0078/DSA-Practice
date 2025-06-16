package Contest5;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if (i==s.length()-1){
                char ch = s.charAt(i);
                System.out.print(s.charAt(i));
                if (ch>=65 && ch<=90){
                    System.out.println();
                }
            }else {
                char ch = s.charAt(i + 1);
                System.out.print(s.charAt(i));
                if (ch >= 65 && ch <= 90) {
                    System.out.println();
                }
            }
        }
    }
}

package Contest5;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

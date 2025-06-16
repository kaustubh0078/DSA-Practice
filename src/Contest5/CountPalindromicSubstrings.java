package Contest5;

import java.util.Scanner;

public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(substrings(s));
    }
    public static int substrings(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i,j+1))){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPalindrome(String s){
        if (s.length()==1){
            return true;
        }
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

package Contest5;

import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))){
                count++;
                max = Math.max(max,count);
            }else {
                count=0;
            }
        }
        System.out.println(max);
    }
    public static boolean isVowel(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}

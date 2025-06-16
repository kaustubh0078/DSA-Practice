package Contest5;

import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(max(s));
    }
    public static char max(String s){
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    count++;
                }
                if (max<count){
                    max = count;
                    maxIdx = i;
                }
            }
        }
        return s.charAt(maxIdx);
    }
}

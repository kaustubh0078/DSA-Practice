package Contest5;

import java.util.Scanner;

public class OddEvenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i);
            if (i%2==0){  //even
                char ch = (char)(temp+1);
                result.append(ch);
            }else {
                char ch = (char)(temp-1);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}

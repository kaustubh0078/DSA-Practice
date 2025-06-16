package Contest5;

import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char temp = s.charAt(i-1);
            if (s.charAt(i)!=temp){
                result.append(temp);
                result.append(count);
                count = 1;
            }else {
                count++;
            }
        }
        result.append(s.charAt(s.length()-1));
        result.append(count);
        System.out.println(result);
    }
}

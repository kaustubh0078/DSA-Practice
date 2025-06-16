package Contest5;

import java.util.Scanner;

public class DifferenceInAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int diff = s.charAt(i)-s.charAt(i-1);
            result.append(diff);
            result.append(s.charAt(i));
        }
        System.out.println(result);
    }
}

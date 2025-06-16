package Contest5;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            char temp = s.charAt(i-1);
            if (temp!=s.charAt(i)){
                result.append(temp);
            }
        }
        result.append(s.charAt(s.length()-1));
        System.out.println(result);
    }
}

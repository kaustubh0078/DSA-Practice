package Practice;
import java.util.*;
public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        long sq = (long)k * k;
        String str = String.valueOf(sq);
        int len = String.valueOf(k).length();

        int right = 0;
        int left = 0;

        if (str.length() > 1) {
            String r = str.substring(str.length() - len);
            String l = str.substring(0, str.length() - len);
            right = Integer.parseInt(r);
            left = Integer.parseInt(l);
        } else {
            right = (int)sq;
        }

        if (left + right == k) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }
}

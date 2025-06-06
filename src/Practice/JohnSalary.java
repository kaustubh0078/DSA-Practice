package Practice;
import java.util.*;
public class JohnSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hours = new int[7];

        for (int i = 0; i < 7; i++) {
            hours[i] = sc.nextInt();
        }

        int base = 100;
        int extra = 15;
        double total = 0;

        for (int i = 0; i < 7; i++) {
            int daily = hours[i];
            int extraHours = 0;
            if (daily > 8) {
                extraHours = daily - 8;
            }
            int normalHours = daily - extraHours;
            int dailyPay = normalHours * base + extraHours * (base + extra);

            if (i == 0) {
                dailyPay += dailyPay * 0.5;
            } else if (i == 6) {
                dailyPay += dailyPay * 0.25;
            }

            total += dailyPay;
        }

        System.out.println((int)total);

    }
}

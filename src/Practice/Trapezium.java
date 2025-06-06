package Practice;
import java.util.*;
public class Trapezium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num = 1;
        int total = rows * (rows + 1) / 2;
        int end = total * 2;

        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < i * 2; s++) {
                System.out.print("-");
            }

            int count = rows - i;
            int left = num;
            int right = end - count + 1;

            for (int j = 0; j < count; j++) {
                System.out.print((left++) + "*");
            }

            num = left;

            right = end - count + 1;
            for (int j = 0; j < count; j++) {
                System.out.print(right++);
                if (j != count - 1) System.out.print("*");
            }

            end -= count;
            System.out.println();
        }

    }
}

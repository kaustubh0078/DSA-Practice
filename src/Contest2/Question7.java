package Contest2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        double f = 5.0/9.0;
        for (int i = 0; i <= max/step ; i++) {
            int ans = (int)((f)*(min-32));
            System.out.print(min+ " ");
            System.out.println(ans);
            min+=step;
        }
    }
}

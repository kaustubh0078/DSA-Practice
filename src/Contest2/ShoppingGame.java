package Contest2;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int aayushCount = 0, harshitCount = 0;
            int turn = 1;

            while (true) {
                if (turn % 2 != 0) {
                    if (aayushCount + turn > n1) {
                        System.out.println("Harshit");
                        break;
                    }
                    aayushCount += turn;
                } else {
                    if (harshitCount + turn > n2) {
                        System.out.println("Aayush");
                        break;
                    }
                    harshitCount += turn;
                }
                turn++;
            }
        }
    }
}

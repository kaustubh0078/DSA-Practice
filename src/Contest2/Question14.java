package Contest2;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            sum = sum+n;
            if (sum<0){
                break;
            }
            System.out.println(n);
        }
    }

}

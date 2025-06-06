package Lecture5;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n = sc.nextInt();

        int ans = 0;
        while (n>0){
            int rem = n%2;
            ans = ans*10+rem;
            n = n/2;
        }
        System.out.println(ans);
    }
}

package Lecture5;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int n = sc.nextInt();

        int ans = 0;
        int place = 0;
        while (n>0){
            int digit = n%10;
            ans = ans+(int)(digit*Math.pow(2,place));
            n = n/10;
            place++;
        }
        System.out.println(ans);
    }
}

package Lecture5;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int dividend = 120;
        int divisor = 36;

        while (dividend%divisor>0){
            int rem = dividend%divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}

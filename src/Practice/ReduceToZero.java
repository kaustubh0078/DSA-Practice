package Practice;

import java.util.Scanner;

public class ReduceToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zero(n));
    }
    public static int zero(int n){
        int count = 0;
        while (n>0){
            n-=maxDivisor(n);
            count++;
        }
        return count;
    }
    public static int maxDivisor(int n){
        int num = 0;
        if (n==1){
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                num = Math.max(num,i);
            }
        }
        return num;
    }
}

package Contest6;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd(n);
        even(2,n);
    }
    public static void odd(int n){
        if (n<=0){
            return;
        }
        if (n%2!=0){
            System.out.println(n);
        }
        odd(n-1);
    }
    public static void even(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        even(i+2,n);
    }
}

package Contest2;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int place = noOfDigits(n);
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans = ans+(int)Math.pow(rem,place);
            n = n/10;
        }
        if (ans==copy){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static int noOfDigits(int n){
        int place = 0;
        while (n>0){
            n = n/10;
            place++;
        }
        return place;
    }
}

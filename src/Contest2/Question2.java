package Contest2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int noToFind = sc.nextInt();
        int ans = 0;
        while (num>0){
            int rem = num%10;
            if (rem == noToFind){
                ans++;
            }
            num = num/10;
        }
        System.out.println(ans);
    }
}

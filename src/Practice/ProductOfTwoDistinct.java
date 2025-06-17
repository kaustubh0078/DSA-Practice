package Practice;

import java.util.Scanner;
public class ProductOfTwoDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0 && n/i!=i){
                count++;
            }
        }
        System.out.println(count);
    }
}

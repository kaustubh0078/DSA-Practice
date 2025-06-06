package Contest3;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            int bin = sc.nextInt();
            int ans = binary(bin);
            n--;
            System.out.println(ans);
        }
    }
    public static int binary(int n){
        int ans = 0;
        int place = 0;
        while (n>0){
            int rem = n%10;
            ans = ans+(rem*(int)Math.pow(2,place));
            n = n/10;
            place++;
        }
        return ans;
    }
}

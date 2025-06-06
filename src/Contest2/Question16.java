package Contest2;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        int decimal = noToDecimal(sb,sn);
        int ans = 0;
        int place = 0;
        while (decimal>0){
            int rem = decimal%db;
            ans = ans+rem*(int)Math.pow(10,place);
            decimal= decimal/db;
            place++;
        }
        System.out.println(ans);
    }
    public static int noToDecimal(int sb, int sn){
        int place = 0;
        int ans = 0;
        while (sn>0){
            int rem = sn%10;
            ans = ans+(int)(rem*Math.pow(sb,place));
            sn = sn/10;
            place++;
        }
        return ans;
    }
}

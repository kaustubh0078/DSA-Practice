package Contest1;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                flag = 1;
                break;
            }
        }
        if (flag==1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }

}

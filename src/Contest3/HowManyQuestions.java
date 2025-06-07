package Contest3;

import java.util.Scanner;

public class HowManyQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        System.out.println(questions(a,b,c));
    }
    public static int questions(int[] a, int[] b, int[] c){
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            int temp1 = a[i];
            int temp2 = b[i];
            int temp3 = c[i];
            if (temp1==1){
                count++;
            }
            if (temp2==1){
                count++;
            }
            if (temp3==1){
                count++;
            }
            if (count>=2){
                ans++;
            }
        }
        return ans;
    }
}

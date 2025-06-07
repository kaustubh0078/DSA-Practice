package Contest3;

import java.util.Scanner;

public class NobitaGoodMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] x = new int[t];
        int[] n = new int[t];
        for (int i = 0; i < t; i++) {
            x[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }
        int[] ans = result(x,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] result(int[] x, int[] n){
        int[] ans = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int a = x[i] % n[i];
            ans[i] = Math.min(a,n[i]-a);
        }
        return ans;
    }
}

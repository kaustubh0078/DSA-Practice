package Contest3;

import java.util.Scanner;

public class MaxSumPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[m];
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(sum(a,b));
            t--;
        }
    }
    public static int sum(int[] a, int[] b){
        int i = 0;
        int sum1 = 0;
        int j = 0;
        int sum2 = 0;
        int result = 0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                sum1+=a[i];
                i++;
            } else if (a[i]>b[j]) {
                sum2+=b[j];
                j++;
            }else {
                result+=Math.max(sum1,sum2)+a[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while (i< a.length){
            sum1+=a[i];
            i++;
        }
        while (j< b.length){
            sum2+=b[j];
            j++;
        }
        result+=Math.max(sum1,sum2);
        return result;
    }
}

package Practice;

import java.util.Scanner;

public class MagicOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (ans(arr,k)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean ans(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                break;
            }
            if (Math.pow(k,i)!=arr[i]){
                return false;
            }
        }
        return true;
    }
}

package Contest5;

import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int m = sc.nextInt();
            String[] arr = new String[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.next();
            }
            t--;
            System.out.println(result(arr));
        }
    }
    public static StringBuilder result(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (!isFirstBigger(arr[j], arr[j+1])){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb;
    }
    public static boolean isFirstBigger(String a, String b){
        String ab = a+b;
        String ba = b+a;

        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i)>ba.charAt(i)){
                return true;
            }else if (ab.charAt(i)<ba.charAt(i)){
                return false;
            }
        }
        return false;
    }
}

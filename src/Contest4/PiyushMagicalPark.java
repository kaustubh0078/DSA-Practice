package Contest4;

import java.util.Scanner;

public class PiyushMagicalPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.next();
            }
        }
        park(arr,s,k);
    }
    public static void park(String[][] arr, int s, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j!=arr[0].length-1){
                    String cell = arr[i][j];
                    if (cell.equals(".")){
                        s-=3;
                    } else if (cell.equals("*")) {
                        s+=4;
                    }else {
                        break;
                    }
                }else {
                    String cell = arr[i][j];
                    if (cell.equals(".")){
                        s-=2;
                    } else if (cell.equals("*")) {
                        s+=5;
                    }else {
                        break;
                    }
                }
                if (s<k){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
        System.out.println(s);
    }
}

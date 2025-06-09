package Contest4;

import java.util.Scanner;

public class MummySpeech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(speech(arr));
    }
    public static boolean speech(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i<j){
                    if (arr[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

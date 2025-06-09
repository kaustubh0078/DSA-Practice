package Contest4;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] brr = rotate(arr);
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate(int[][] arr){
        int[][] brr = new int[arr.length][arr[0].length];
        for (int j = arr[0].length-1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                brr[arr.length-j-1][i] = arr[i][j];
            }
        }
        return brr;
    }
}

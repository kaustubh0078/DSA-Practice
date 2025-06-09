package Contest4;

import java.util.Scanner;

public class RowWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr =new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rowWise(arr);
    }
    public static void rowWise(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            if (row%2==0){
                for (int col = 0; col < arr[0].length; col++) {
                    System.out.print(arr[row][col]+", ");
                }
            }else {
                for (int col = arr[0].length-1; col >= 0; col--) {
                    System.out.print(arr[row][col]+", ");
                }
            }
        }
        System.out.println("END");
    }
}

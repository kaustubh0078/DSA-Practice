package Contest4;

import java.util.Scanner;

public class BooleanMatrix {
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
        int[][] temp =  bool(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] bool(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==1){
                    makeOne(temp,i,j);
                }
            }
        }
        return temp;
    }
    public static void makeOne(int[][] arr, int i, int j){
        for (int k = 0; k < arr[0].length; k++) {
            arr[i][k] = 1;
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k][j] = 1;
        }
    }
}

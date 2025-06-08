package Lecture14;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        transpose(arr);
        System.out.println("After Transpose");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
    }
}

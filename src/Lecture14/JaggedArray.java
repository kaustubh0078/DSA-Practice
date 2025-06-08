package Lecture14;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];

        for (int i = 0; i < arr.length; i++) {
            int m = sc.nextInt();
            int[] temp = new int[m];
            arr[i] = temp;
        }

        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

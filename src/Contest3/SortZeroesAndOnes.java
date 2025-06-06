package Contest3;

import java.util.Scanner;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr){
        for (int pass = 0; pass < arr.length-1; pass++) {
            for (int i = pass+1; i < arr.length; i++) {
                if (arr[pass]>arr[i]){
                    int temp = arr[pass];
                    arr[pass] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

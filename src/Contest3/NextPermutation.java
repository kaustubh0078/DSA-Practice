package Contest3;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void nextPermutation(int[] arr){
        int i = arr.length-2;
        while (i>=0 && arr[i]>arr[i+1]){
            i--;
        }
        if (i<0){
            reverse(arr,0, arr.length-1);
            return;
        }
        int j = arr.length-1;
        while (arr[j]<=arr[i]){
            j--;
        }
        swap(arr,i,j);
        reverse(arr,i+1, arr.length-1);
    }
    public static void reverse(int[] arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

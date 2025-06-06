package Lecture10;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr){
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length-pass; i++) { //arr.length -1, arr.length -2 and so on
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}

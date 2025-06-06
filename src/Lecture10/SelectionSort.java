package Lecture10;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,-2,4,3,-3,11,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i; // min index
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

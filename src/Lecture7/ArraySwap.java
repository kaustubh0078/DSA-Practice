package Lecture7;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = {6,7,8,9,10};
        System.out.println(arr[1]+" Before "+brr[1]);
        swap(arr,brr);
        System.out.println(arr[1]+" After "+brr[1]);
    }
    public static void swap(int[] arr, int[] brr){
        int temp = arr[1];
        arr[1] = brr[1];
        brr[1] = temp;
    }
}

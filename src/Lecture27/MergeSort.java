package Lecture27;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {12,1,3,2,-4,11};
        int merged[] = rec(arr,0,arr.length-1);
        System.out.println(Arrays.toString(merged));
    }
    public static int[] rec(int[] arr, int si, int ei){
        if (si==ei){  // 1 element left after division
            int temp[] = new int[1];
            temp[0] = arr[si];
            return temp;
        }
        int mid = (si+ei)/2;
        int fh[] = rec(arr,si,mid);
        int sh[] = rec(arr,mid+1,ei);
        return merge(fh,sh);
    }
    public static int[] merge(int[] arr, int[] brr){
        int ans[] = new int[arr.length+ brr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< arr.length && j< brr.length){
            if (arr[i]<brr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = brr[j];
                j++;
            }
            k++;
        }
        while (i< arr.length){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j< brr.length){
            ans[k] = brr[j];
            j++;
            k++;
        }
        return ans;
    }
}

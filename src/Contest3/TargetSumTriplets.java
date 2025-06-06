package Contest3;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        ans(arr,target);
    }
    public static void ans(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==target){
                        int[] temp = {arr[i],arr[j],arr[k]};
                        Arrays.sort(temp);
                        System.out.print(temp[0]+","+" "+temp[1]+" "+"and "+temp[2]);
                        System.out.println();
                    }
                }
            }
        }
    }
}

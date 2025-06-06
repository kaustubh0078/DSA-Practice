package Contest3;

import java.util.Scanner;

public class PatientSeverity {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortColors(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i; j++) {
                if (nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}

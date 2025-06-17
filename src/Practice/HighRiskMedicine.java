package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class HighRiskMedicine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(capsule(arr,l));
    }
    public static int capsule(int[] arr, int l){
        Arrays.sort(arr);
        int highRisk = 0;
        int lowRisk = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=81 || arr[i]<=10){
                highRisk++;
            }else {
                lowRisk++;
            }
        }
        int days = 0;
        while (highRisk>0 || lowRisk>0){
            int capsules = l;
            while (highRisk>0 && capsules>0){
                highRisk--;
                capsules--;
            }
            while (lowRisk>0 && capsules>0){
                lowRisk--;
                capsules--;
            }
            days++;
        }
        return days;
    }
}

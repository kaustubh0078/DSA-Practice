package Practice;

import java.util.Scanner;

public class RamTravels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(travel(arr));
    }
    public static int travel(int[] arr){
        int count = 0;
        int i = 0;
        while (i<arr.length-1){
            int jump = arr[i];
            i+=jump;
            count++;
        }
        return count;
    }
}

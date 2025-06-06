package Contest3;

import java.beans.EventHandler;
import java.util.Arrays;
import java.util.Scanner;

// THIS SOLUTION HAS TLE

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // no of roses
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int m = sc.nextInt();  //amount of money
            Arrays.sort(arr);

            int left = 0, right = n-1;
            int rose1 = 0, rose2 = 0;
            int minDiff = Integer.MAX_VALUE;

            while (left<right){
                int sum = arr[left]+arr[right];
                if (sum==m){
                    int diff = arr[right]-arr[left];
                    if (diff<minDiff){
                        minDiff = diff;
                        rose1 = arr[left];
                        rose2 = arr[right];
                        left++;
                        right--;
                    }
                } else if (sum<m) {
                    left++;
                }else {
                    right--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
            System.out.println();
        }
    }

}

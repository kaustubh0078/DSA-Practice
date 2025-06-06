package Lecture11;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { //starting pt
            int sum = arr[i];
            max = Math.max(max,sum);
            for (int j = i+1; j < arr.length; j++) { //ending pt
                sum += arr[j];
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }
}

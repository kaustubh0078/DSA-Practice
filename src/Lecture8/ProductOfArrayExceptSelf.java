package Lecture8;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int[] left = new int[nums.length];
        Arrays.fill(left,1);
        for (int i = 1; i < left.length; i++) {
            left[i] = nums[i-1]*left[i-1];
        }

        int[] right = new int[nums.length];
        Arrays.fill(right,1);
        for (int i = right.length-2; i >= 0; i--) {
            right[i] = nums[i+1]*right[i+1];
        }

        Arrays.fill(answer,1);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = left[i]*right[i];
        }
        return answer;
    }
}

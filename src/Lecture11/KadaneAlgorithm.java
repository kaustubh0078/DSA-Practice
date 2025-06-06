package Lecture11;

public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max,sum);

            if (sum<0){  //reset starting point
                sum=0;
            }
        }
        return max;
    }
}

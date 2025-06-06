package Lecture9;

public class RotateArray {
//    public void rotate(int[] nums, int k) {
//        k = k% nums.length;
//
//        for (int i = 0; i < k; i++) {
//            int temp = nums[nums.length-1];
//
//            for (int j = nums.length-2; j >= 0 ; j--) {
//                nums[j+1] = nums[j];
//            }
//
//            nums[0] = temp;
//        }
//    }
    public void rotate(int[] nums, int k) {
        k = k% nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums,k, nums.length-1);
    }
    public void reverse(int[] nums, int i, int j){
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}



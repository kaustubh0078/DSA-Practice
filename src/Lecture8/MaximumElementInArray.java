package Lecture8;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,-1,3,4,16,12,-2};
        int max = Integer.MIN_VALUE; //ARR[0] can also be used
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}

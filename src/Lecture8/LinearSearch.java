package Lecture8;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,-12,31,9,11};
        System.out.println(find(arr,9));
    }
    public static int find(int arr[], int target){
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

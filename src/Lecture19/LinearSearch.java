package Lecture19;

public class LinearSearch {
    public static void main(String[] args) {

    }
    public static int search(int i, int[] arr, int target){
        if (i== arr.length){
            return -1;
        }
        if (arr[i]==target){
            return i;
        }
        return search(i+1,arr,target);
    }
}

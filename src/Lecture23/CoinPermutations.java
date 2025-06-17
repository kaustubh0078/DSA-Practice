package Lecture23;

public class CoinPermutations {
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        rec(arr,10,"");
    }
    public static void rec(int arr[], int amount, String ans){
        if (amount==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (amount<arr[i]){
                return;
            }
            rec(arr,amount-arr[i],ans+arr[i]);
        }
    }
//    public static void rec(int[] arr, int amount, String ans){
//        if (amount==0){
//            System.out.println(ans);
//            return;
//        }
//        if (amount<0){
//            return;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            rec(arr,amount-arr[i],ans+arr[i]);
//        }
//    }
}

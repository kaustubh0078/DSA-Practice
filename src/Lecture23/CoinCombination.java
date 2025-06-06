package Lecture23;

public class CoinCombination {
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        rec(arr,10,"",0);
    }
    public static void rec(int arr[], int amt, String ans, int si){
        if (amt==0){
            System.out.println(ans);
            return;
        }
        for (int i = si; i < arr.length; i++) {
            if (amt<arr[i]){
                return;
            }
            rec(arr,amt-arr[i],ans+arr[i],i);
        }
    }
}

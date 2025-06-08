package Lecture12;

public class KthRoot {
    public static void main(String[] args) {
        int n = 216;
        int k = 4;
        int i = 1;
        int j = n;
        int ans = -1;
        while (i<=j){
            int mid = (i+j)/2;
            if (Math.pow(mid,k)<=n){
                i = mid+1;
                ans = mid;
            }else {
                j = mid-1;
            }
        }
        System.out.println(ans);
    }
}

package Lecture11;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        int ans = -1;

        while (i<=j){
            int mid = i+(j-i)/2;
            if (isBadVersion(mid)){
                j = mid-1;
                ans = mid;
            }else{
                i = mid+1;
            }
        }
        return ans;
    }
    public boolean isBadVersion(int n){
        return false; //aise hi daal diya, real in leetcode
    }
}

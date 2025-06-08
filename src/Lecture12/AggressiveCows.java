package Lecture12;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int noc = 3;
        int pos[] = {1,2,4,8,9};
        int i = 1;
        int j = pos[pos.length-1]-pos[0];
        Arrays.sort(pos);
        int ans = -1;
        while (i<=j){
            int mid = (i+j)/2;
            if (isPossible(noc,pos,mid)){
                ans = mid;
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPossible(int noc, int[] pos, int mid){  //mid = minDistance
        int li = 0;  // last index where cow is placed
        int cpsf = 1;  //cows placed so far
        for (int i = 1; i < pos.length; i++) {
            if (pos[i]-pos[li]>=mid){
                li = i;
                cpsf++;
            }
            if (cpsf==noc){
                return true;
            }
        }
        return false;
    }
}

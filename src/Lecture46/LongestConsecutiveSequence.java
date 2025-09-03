package Lecture46;

import Lecture33.P;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();

        for (int i:nums){
            if (map.containsKey(i-1)){
                map.put(i,false);
            }else {
                map.put(i,true);
            }
            if (map.containsKey(i+1)) {
                map.put(i+1,false);
            }
        }

        int ans = 0;
        for (int i : map.keySet()){
            if (map.get(i)){   // if true, only then check
                int count = 0;
                while (map.containsKey(i)){
                    count++;
                    i++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}

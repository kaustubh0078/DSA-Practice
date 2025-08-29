package Lecture44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
//    O(N)
//    public int[] intersection(int[] arr1, int[] arr2) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer, Integer> map1 = new HashMap<>();
//        for (int i = 0; i < arr1.length; i++) {
//            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
//        }
//        HashMap<Integer, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < arr2.length; i++) {
//            map2.put(arr2[i],map1.getOrDefault(arr2[i],0)+1);
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            if (map2.containsKey(arr1[i]) && !ans.contains(arr1[i])){
//                ans.add(arr1[i]);
//            }
//        }
//        int[] ans2 = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++) {
//            ans2[i] = ans.get(i);
//        }
//        return ans2;
//    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i:nums1){
            set.add(i);
        }
        for (int i:nums2){
            if (set.contains(i)){
                ans.add(i);
            }
        }
        int[] arr = new int[ans.size()];
        int i = 0;
        for (int num:ans){
            arr[i]=num;
            i++;
        }
        return arr;
    }
}

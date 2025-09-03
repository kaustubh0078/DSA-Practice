package Lecture46;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            // sorting
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            if (map.containsKey(str)){
                map.get(str).add(s);  // get the value of key str, and add the original string s in it
            }else {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(str,temp);
            }
        }
        for (String s:map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}

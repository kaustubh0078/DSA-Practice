package Lecture44;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String s = "aaBBBssbbcc3A4c";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0; i<s.length();i++){
            char ch = s.charAt(i);
//            if (map.containsKey(ch)){
//                map.put(ch, map.get(ch)+1);
//            }else {
//                map.put(ch,1);
//            }
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}

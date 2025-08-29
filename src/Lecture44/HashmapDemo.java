package Lecture44;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);

        map.put(null,1000);
        map.put("null",234);
        System.out.println(map);

        map.remove("A");
        map.remove("AA");  //handles exception by itself
        System.out.println(map);

        System.out.println(map.containsKey("B"));

        for (String s:map.keySet()){
            System.out.println(s+" ==> "+map.get(s));
        }
    }
}

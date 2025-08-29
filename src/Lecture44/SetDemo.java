package Lecture44;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        //only unique values
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
//        set.add(null);

        set.remove(2);
        System.out.println(set.contains(1));
        System.out.println(set);

        for (int i:set){
            System.out.println(i);
        }
    }
}

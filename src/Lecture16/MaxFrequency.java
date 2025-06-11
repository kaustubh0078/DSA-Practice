package Lecture16;

public class MaxFrequency {
    public static void main(String[] args) {
        String s = "ababacdxz";
        int[] arr = new int[26];

        //map and fill the array
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int diff = ch - 'a';
            arr[diff]++;
        }

        //max value in the array
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }

        System.out.println(max);
    }
}

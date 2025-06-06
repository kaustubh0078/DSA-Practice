package Lecture16;

import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        String s = "cbaeicdeaieou";
        System.out.println(number(s));
    }
    public static int number(String s){
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowel(s.charAt(i))){
                count++;
            }else{
                count=0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static boolean vowel(char ch){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}

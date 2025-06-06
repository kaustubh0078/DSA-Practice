package Lecture32;

import java.util.Arrays;
import java.util.Stack;

public class DISequence {
    public static void main(String[] args) {
        String s = "IIDD";
        int ans[] = new int[s.length()+1];
        int count = 1;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= s.length(); i++) {
            if (i==s.length() || s.charAt(i)=='I'){
                ans[i] = count;
                count++;
                while (!st.isEmpty()){
                    ans[st.pop()] = count;
                    count++;
                }
            }else {
                st.push(i);
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

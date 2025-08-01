package Lecture32;

import java.util.*;

public class Histogram {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]<=arr[st.peek()]){
                int h = arr[st.pop()];
                if (st.isEmpty()){  // smallest element encountered
                    int w = i;
                    ans = Math.max(ans,h*w);
                }else{
                    int w = i - st.peek() - 1;  // -1 for excluding both sides
                    ans = Math.max(ans,h*w);
                }
            }
            st.push(i);
        }
        int i = arr.length;   // for remaining elements in stack(if increasing pattern)
        while (!st.isEmpty()){
            int h = arr[st.pop()];
            if (st.isEmpty()){
                int w = i;
                ans = Math.max(ans,h*w);
            }else{
                int w = i - st.peek() - 1;
                ans = Math.max(ans,h*w);
            }
        }
        System.out.println(ans);
    }
}

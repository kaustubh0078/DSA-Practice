package Lecture31;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4,2,6,7,8,1,9,10,19,3};
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]>=arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()] = -1;
        }
        System.out.println(Arrays.toString(ans));
    }
}

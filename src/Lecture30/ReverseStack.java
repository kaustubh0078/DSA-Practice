package Lecture30;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }

        int temp = st.pop();
        reverse(st);
        iaboptimised(temp,st);
    }

    public static void iaboptimised(int item, Stack<Integer> st){
        if (st.isEmpty()){
            st.push(item);
            return;
        }

        int temp = st.pop();
        iaboptimised(item,st);
        st.push(temp);
    }
}

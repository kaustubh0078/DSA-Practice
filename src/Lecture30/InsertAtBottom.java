package Lecture30;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        iaboptimised(60,st);
        System.out.println(st);
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

    private static void iab(int item, Stack<Integer> st) {
        Stack<Integer>  helper = new Stack<>();

        while(!st.isEmpty()) {
            helper.push(st.pop());
        }

        st.push(item);

        while(!helper.isEmpty()) {
            st.push(helper.pop());
        }
    }
}

package Lecture32;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = celebrity(arr);
        System.out.println(ans);
    }
    public static int celebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size()>1){
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b]==0){
                st.push(a);
            }else{
                st.push(b);
            }
        }
        int c = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i==c){
                continue;
            }
            if (arr[c][i]==1){
                return -1;
            }
            if (arr[i][c]==0){
                return -1;
            }
        }
        return c;
    }
}

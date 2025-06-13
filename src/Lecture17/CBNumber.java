package Lecture17;

import java.util.Scanner;
public class CBNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        boolean[] visited = new boolean[s.length()];

        for (int i = 1; i < s.length(); i++) {  //loop to print substrings in ascending order of characters present
            for (int j = 0; j <= s.length()-i; j++) {
                String temp = s.substring(j,j+i);
                long l = Long.parseLong(temp);
                if (isCB(l) && isVisited(j,j+i,visited)){
                    System.out.println(l);
                    count++;

                    for (int k = j; k < j+i; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isCB(long l){
        if (l==0 || l==1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for (int i = 0; i < arr.length; i++) {
            if (l==arr[i]){
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (l%arr[i]==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isVisited(int i, int j, boolean[] visited){
        for (int k = i; k < j; k++) {
            if (visited[k]){
                return false;
            }
        }
        return true;
    }
}

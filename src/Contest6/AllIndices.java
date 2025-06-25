package Contest6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        rec(arr,m,0,list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void rec(int[] arr, int target, int i, ArrayList<Integer> list){
        if (i== arr.length){
            return;
        }
        rec(arr,target,i+1,list);
        if (arr[i]==target){
            list.add(i);
        }
    }
}

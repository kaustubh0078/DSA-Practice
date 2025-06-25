package Contest6;

import java.util.ArrayList;
import java.util.Scanner;
public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int ans = rec(arr,a,b,0);
        System.out.println(ans);
    }
    public static int rec(int[] arr, ArrayList<Integer> a, ArrayList<Integer> b, int i){
        if (i == arr.length){
            if (sum(a)==sum(b)){
                for (int j = 0; j < a.size(); j++) {
                    System.out.print(a.get(j)+" ");
                }
                System.out.print("and ");
                for (int j = 0; j < b.size(); j++) {
                    System.out.print(b.get(j)+" ");
                }
                System.out.println();
                return 1;
            }
            return 0;
        }

        a.add(arr[i]);
        int c = rec(arr,a,b,i+1);
        a.remove(a.size()-1);

        b.add(arr[i]);
        int d = rec(arr,a,b,i+1);
        b.remove(b.size()-1);

        return c+d;
    }
    public static int sum(ArrayList<Integer> a){
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum+=a.get(i);
        }
        return sum;
    }
}

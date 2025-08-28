package Lecture42;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            Pair[] arr = new Pair[n];
            for (int i = 0; i < arr.length; i++) {
                Pair p = new Pair();
                p.st = sc.nextInt();
                p.et = sc.nextInt();
                arr[i] = p;
            }
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.et-o2.et;
                }
            });
            int count = 1;
            int cet = arr[0].et;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].st>=cet){
                    cet = arr[i].et;
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
    public static class Pair{
        int st;
        int et;
    }
}

package Lecture13;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int nob = sc.nextInt();
            int nos = sc.nextInt();

            int book[] = new int[nob];
            int sum = 0;
            for (int i = 0; i < book.length; i++) {
                book[i] = sc.nextInt();
                sum+=book[i];
            }
            binarysearch(book,nos,sum);
            t--;
        }
    }
    public static int binarysearch(int[] book, int nos , int sum){
        int low = 1;
        int hi = sum;
        int ans = 0;
        while (low<=hi){
            int mid = (low+hi)/2;
            if (itIsPossible(book,nos,mid)){
                ans = mid;
                hi = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean itIsPossible(int book[], int nos, int mid){
        int s = 1;
        int pagesRead = 0;
//        for (int i = 0; i < book.length; i++) {
//
//        }
        return false;
    }
}

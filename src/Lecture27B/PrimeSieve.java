package Lecture27B;

public class PrimeSieve {
    public static void main(String[] args) {
        primesieve(1000);
    }
    public static void primesieve(int n){
        boolean[] arr = new boolean[n+1];
        arr[0]= true;
        arr[1]= true;
        for (int i = 2; i*i<= n; i++) {
            if (arr[i]==false){
                for (int j = 2; i*j < arr.length; j++) {
                    arr[i*j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}

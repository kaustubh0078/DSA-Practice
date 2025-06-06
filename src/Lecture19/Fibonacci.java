package Lecture19;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    public static int fibo(int n){
        if (n==0||n==1){
            return n;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        return a+b;
    }
}

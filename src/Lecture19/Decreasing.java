package Lecture19;

public class Decreasing {
    public static void main(String[] args) {
        PrintDec(10);
    }
    public static void PrintDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintDec(n-1);
    }
}

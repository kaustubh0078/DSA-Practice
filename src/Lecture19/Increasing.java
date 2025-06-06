package Lecture19;

public class Increasing {
    public static void main(String[] args) {
        PrintInc(10);
    }
    public static void PrintInc(int n){
        if (n==0){
            return ;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
}

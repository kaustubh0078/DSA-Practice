package Lecture6;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        swap(a,b);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}

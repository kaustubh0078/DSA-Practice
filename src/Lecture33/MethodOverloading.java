package Lecture33;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));

        System.out.println(add(10,20,200,90,89));
    }
//    public int add(int a, int b){
//        return a+b;
//    }
//
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }

    public static int add(int... args){
        int arr[] = args;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }
}

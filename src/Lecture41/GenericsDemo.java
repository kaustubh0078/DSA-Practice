package Lecture41;

public class GenericsDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};   //used Integer class instead of int
        String[] arr1 = {"AB","DE","VILLIERS"};
        display(arr);
        display(arr1);
    }
    public static <T>void display(T arr[]){  //T should be a class
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

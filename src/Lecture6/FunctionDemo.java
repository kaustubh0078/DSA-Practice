package Lecture6;

public class FunctionDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        add();
        System.out.println("Bye");
    }

    public static void add() {
        int a = 10;
        int b = 20;
        sub();
        System.out.println(a+b);
    }
    public static void sub() {
        int a = 10;
        int b = 20;
        System.out.println(a-b);
    }
}

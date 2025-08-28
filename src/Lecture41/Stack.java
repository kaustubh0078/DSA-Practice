package Lecture41;

public interface Stack {
    public void push();
    public void pop();
    public void peek();

    private void f(){

    }
    static void f1(){
        System.out.println("Hi from static");
    }

    public static void main(String[] args) {
        Stack.f1();
    }
}

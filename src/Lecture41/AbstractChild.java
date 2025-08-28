package Lecture41;

public class AbstractChild extends AbstractClassDemo{
    @Override
    public void random() {
        System.out.println("Hi from random");
    }
    @Override
    public void random2() {
        System.out.println("Hi from random 2");
    }
    public static void main(String[] args) {
        AbstractChild ac = new AbstractChild();
        ac.random();
        ac.random2();
        ac.random3();
    }
}

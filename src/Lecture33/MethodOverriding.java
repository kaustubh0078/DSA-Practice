package Lecture33;

public class MethodOverriding {

    @Override
    public String toString(){
        return "Method Overriding";
    }

    public static void main(String[] args) {
        MethodOverriding mo = new MethodOverriding();
        System.out.println(mo);
        System.out.println(mo.toString());
    }
}

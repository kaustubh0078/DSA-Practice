package Lecture41;

public abstract class Payment {
    public abstract void how();
    public  int transaction(){
        return 1000;
    }

    public static void main(String[] args) {
        Payment p = new Payment() {
            @Override
            public void how() {
                System.out.println("Hi from how");
            }
        };
    }
}

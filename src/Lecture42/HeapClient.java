package Lecture42;

public class HeapClient {
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(-1);
        h.add(2);
        h.add(10);
        h.add(20);
        h.add(3);
        h.add(8);
        h.add(4);
        h.add(-6);

        System.out.println(h.get());
        h.remove();
        System.out.println(h.get());
        h.remove();
        System.out.println(h.get());
    }
}

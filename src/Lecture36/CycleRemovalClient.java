package Lecture36;

public class CycleRemovalClient {
    public static void main(String[] args) {
        CycleRemoval ll = new CycleRemoval();
        ll.AddFirst(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(6);
        ll.AddLast(7);
        ll.createCycle(3);
//        ll.removeCycle();
//        ll.removeCycleOptimised();
        ll.floydAlgo();
        ll.Display();
    }
}

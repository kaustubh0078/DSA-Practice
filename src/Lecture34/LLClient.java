package Lecture34;

public class LLClient {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddLast(20);
        ll.AddLast(30);
        ll.AddLast(40);
        ll.AddLast(50);
        ll.Display();
//        ll.removeLast();
//        ll.Display();
//        ll.removeFirst();
//        ll.Display();
        ll.addAtIdx(60,2);
        ll.Display();
        ll.removeAtIdx(2);
    }
}

package Lecture35;

import Lecture34.LinkedList;

public class MiddleofLL {
    class Node {
        int data;
        Node next;
        Node(int d)  {
            data = d;
            next = null;
        }
    }
    int getMiddle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}

package Lecture36;

import Lecture34.LinkedList;

public class CycleRemoval {
    public class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size=0;

    public void AddFirst(int item){
        if (this.size == 0) {
            Node nn = new Node();
            nn.val = item;
            this.head = nn;
            this.tail = nn;
        } else {
            Node nn = new Node();
            nn.val = item;
            nn.next = this.head;
            this.head = nn;
        }
        this.size++;
    }
    public void AddLast(int item){
        if (this.size==0){
            Node nn = new Node();
            nn.val = item;
            this.head = nn;
            this.tail = nn;
        }else{
            Node nn = new Node();
            nn.val = item;
            this.tail.next = nn;
            this.tail = nn;
        }
        this.size++;
    }
    public Node getAtIdx(int idx){
        Node temp = this.head;
        int count = 0;
        while (count<idx){
            temp = temp.next;
            count++;
        }
        return temp;
    }
    public void createCycle(int idx){
        Node temp = getAtIdx(idx);
        tail.next = temp;
    }
    public void Display(){
        Node temp = this.head;
        while (temp!=null){
            System.out.print(temp.val+" => ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public Node hasCycle(){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast==slow){
                return slow;
            }
        }
        return null;
    }
    public void removeCycle(){
        Node mp = hasCycle();  // midpoint, where fast and slow meet meaning this is always part of cycle
        Node temp = head;
        while (temp!=null){
            Node p = mp;
            while (p.next!=mp){
                if (p.next==temp){
                    p.next=null;
                    return;
                }
                p = p.next;
            }
            temp = temp.next;
        }
    }

    public void removeCycleOptimised(){
        Node mp = hasCycle();
        Node p = mp;
        int count = 1;
        while (p.next!=mp){
            p = p.next;
            count++;
        }
        Node fast = head;
        Node slow = head;
        while (count>0){
            fast = fast.next;
            count--;
        }
        while (slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public void floydAlgo(){
        Node mp = hasCycle();
        Node fast = mp;
        Node slow = head;
        while (slow.next!=fast.next){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = null;
    }
}

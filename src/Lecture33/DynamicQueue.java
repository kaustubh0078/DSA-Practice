package Lecture33;

import Lecture30.Queue;

public class DynamicQueue extends Queue {
    public void enqueue(int item) throws Exception {
        if(isFull()) {
            int newarr[] = new int[2*arr.length];
            for (int i = 0; i <this.size; i++) {
                int idx = (front+i) % arr.length;
                newarr[i] = arr[idx];
            }
            arr = newarr;
        }
        super.enqueue(item);
    }

    public static void main(String[] args) throws Exception{
        DynamicQueue dq = new DynamicQueue();
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);
        dq.enqueue(10);

        dq.Display();
    }
}

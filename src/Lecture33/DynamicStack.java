package Lecture33;

import Lecture29.Stack;

public class DynamicStack extends Stack {
    @Override
    public void push(int item) throws Exception {
        if(isFull()) {
            int newarr[] = new int[2*arr.length];
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        super.push(item);
    }

    public static void main(String[] args) throws Exception{
        DynamicStack ds = new DynamicStack();
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.push(10);
        ds.Display();
    }
}

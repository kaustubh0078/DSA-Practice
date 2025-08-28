package Lecture42;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap;

    public Heap(){
        heap = new ArrayList<>();
    }
    public void add(int item){
        heap.add(item);   //arraylist ke last me add
        upheapify(heap.size()-1);  //child hamesha last me insert hoga
    }
    public void upheapify(int ci){
        int pi = (ci-1)/2;
        if (heap.get(pi)>heap.get(ci)){   // if parent>child, swap recursively
            swap(ci,pi);
            upheapify(pi);
        }
    }
    public void swap(int ci, int pi){
        int tp = heap.get(pi);
        int tc = heap.get(ci);

        heap.set(ci,tp);
        heap.set(pi,tc);
    }

    public int remove(){
        int rv = heap.get(0);
        swap(0,heap.size()-1);
        heap.remove(heap.size()-1);
        downheapify(0);
        return rv;  // the actual removed element
    }
    public void downheapify(int pi){
        int c1 = 2*pi+1;   //left child
        int c2 = 2*pi+2;   //right child
        int minIdx = pi;
        if (c1<heap.size() && heap.get(c1)<heap.get(minIdx)){  // if child is less than parent and is in the size of the arraylist
            minIdx = c1;
        }
        if (c2<heap.size() && heap.get(c2)<heap.get(minIdx)){
            minIdx = c2;
        }
        if (minIdx!=pi){   // there is a index less than parent in child nodes
            swap(minIdx,pi);   // swap with the child node
            downheapify(minIdx);
        }
    }

    public int get(){
        return heap.get(0);
    }
}

package Lecture45;

import java.util.ArrayList;
import java.util.HashSet;

public class HashMap<K,V> {
    public class Node{
        K key;
        V value;
        Node next;
    }
    private ArrayList<Node> bckt;
    private int size = 0;
    public HashMap(){
        bckt = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            bckt.add(null);
        }
    }
    public HashMap(int n){
        bckt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bckt.add(null);
        }
    }
    public int hasFunc(K key){
        int idx = key.hashCode() % this.bckt.size();
        if (idx<0){
            idx = idx+this.bckt.size();
        }
        return idx;
    }
    public void put(K key, V value){
        int idx = hasFunc(key);
        Node curr = bckt.get(idx);

        //case 1 : key already present
        while (curr!=null){
            if (curr.key.equals(key)){
                curr.value = value;
            }
            curr = curr.next;
        }

        // case 2 : key not present
        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        nn.next = bckt.get(idx);
        bckt.set(idx,nn);
        this.size++;

        double lf = this.size/this.bckt.size();
        double tf = 2.0;
        if (lf>tf){
            rehashing();
        }
    }
    public void rehashing(){
        ArrayList<Node> temp = new ArrayList<>();

        for (int i = 0; i < 2* this.bckt.size(); i++) {
            temp.add(null);
        }

        ArrayList<Node> ll = this.bckt;
        this.bckt = temp;

        for (Node head : bckt) { // traverse on arraylist
            while(head!=null) {
                put(head.key,head.value);
                head = head.next;
            }
        }
    }
    public V remove(K key){
        int idx = hasFunc(key);
        Node curr = bckt.get(idx);
        Node prev = null;

        while (curr!=null){
            if (curr.key.equals(key)){
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        if (curr==null){  // key not found
            return null;
        }
        if (prev==null){   // first element
            bckt.set(idx,curr.next);
            curr.next = null;
        }else {   // key found somewhere in list
            prev.next = curr.next;
            curr.next = null;
        }
        this.size--;
        return curr.value;
    }
    public V get(K key){
        int idx = hasFunc(key);
        Node curr = bckt.get(idx);
        while (curr!=null){
            if (curr.key.equals(key)){
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }
    public boolean containsKey(K key){
        int idx = hasFunc(key);
        Node curr = bckt.get(idx);

        while (curr!=null){
            if (curr.key.equals(key)){
                return true;
            }
            curr= curr.next;
        }
        return false;
    }
    @Override
    public String toString(){
        String s = "{ ";
        for (Node head:bckt){
            while (head!=null){
                s += head.key+" ==> "+head.value+" , ";
                head = head.next;
            }
        }
        s+=" }";
        return s;
    }
}

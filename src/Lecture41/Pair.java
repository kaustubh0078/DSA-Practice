package Lecture41;

public class Pair<K,V>{
    K key;
    V val;
    public Pair(){}
    public Pair(K key, V val){
        this.key = key;
        this.val = val;
    }
    public static void main(String[] args) {
        Pair<Integer,Integer> p = new Pair<>(10,20);
        Pair<Integer,String> p1 = new Pair<>(10,"Messi");
        p.display();
        p1.display();
    }
    public void display(){
        System.out.println(this.key+" ==> "+this.val);
    }
}

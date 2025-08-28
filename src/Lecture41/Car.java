package Lecture41;

public class Car<T> implements Comparable<Car>{
    int price;
    String name;
    int speed;
    public Car(int price, String name, int speed){
        this.name = name;
        this.price = price;
        this.speed = speed;
    }
    public String toString(){
        return "Name: "+this.name+", Price: "+this.price+", Speed: "+this.speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.speed-o.speed;
//        return this.price-o.price;
//        return this.name.compareTo(o.name);  for string
    }
}

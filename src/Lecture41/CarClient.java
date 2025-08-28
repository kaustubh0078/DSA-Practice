package Lecture41;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {
    public static void main(String[] args) {
        Car arr[] = new Car[5];
        arr[0] = new Car(100000,"Nano",60);
        arr[1] = new Car(1000000,"Brezza",100);
        arr[2] = new Car(2000000,"Creta",120);
        arr[3] = new Car(3500000,"Compass",140);
        arr[4] = new Car(5000000,"Fortuner",140);

//        sort(arr);
        Arrays.sort(arr, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
//                return o1.price-o2.price;
                return o1.name.compareTo(o2.name);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static <T extends Comparable<T>>void sort(Car[] arr){
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length-pass; i++) { //arr.length -1, arr.length -2 and so on
                if (arr[i].compareTo(arr[i+1])>0){
                    Car temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}

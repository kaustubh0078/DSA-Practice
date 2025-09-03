package Lecture45;

public class HashCodeDemo {
    public static void main(String[] args) {
        String s = "abcd";
        Integer i = 1093784394;

        Long ll = 10000000000000000L;
        String b = "abcd";
        System.out.println(s.hashCode());
        System.out.println(ll.hashCode());
        System.out.println(b.hashCode());

//		System.out.println(ll.hashCode());
    }
}

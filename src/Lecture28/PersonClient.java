package Lecture28;

public class PersonClient {
    public static void main(String[] args) throws Exception {

        Person p =  new Person();
////		System.out.println(p.id+" "+p.name);
//
//		Person.greet("h");
        p.setAge(-10);
        System.out.println(p.getAge());
    }
}

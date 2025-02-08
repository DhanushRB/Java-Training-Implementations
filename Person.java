import java.util.*;
public class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    void display() {
        System.out.println("name:" +this.name);
        System.out.println("age:" +this.age);
    }

    public static void main(String[] args) {
        Person P = new Person("dhanush",20);
        P.display();
    }
}











package HW.hw24_02_23;

public class Person {
    String fullName;
    int age;
    //конструктор без параметров
    public Person() {
       // System.out.println("конструктор без параметров");
        // Выводится два раза
     }
// конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        // System.out.println("конструктор с параметрами");
        // выводится 1 раз
    }

    void move() {
        System.out.println(age + " is moving");

    }

    void talk() {
        System.out.println(fullName + " is talking");
    }

}

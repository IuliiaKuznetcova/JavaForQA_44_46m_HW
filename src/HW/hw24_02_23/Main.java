package HW.hw24_02_23;

/* 1.Класс Person
Создать класс Person,который содержит:

переменные fullName,age;
методы move()и talk(),в которых просто вывести на консоль сообщение
-"Такой-то  Person говорит".
Добавьте два конструктора-Person()и Person(fullName,age).
Создайте два объекта этого класса.
Один объект инициализируется конструктором Person(),другой-Person(fullName,age)

2.Класс Phone.
Создайте класс Phone,который содержит переменные number,model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы:receiveCall,имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит{name}”.Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.*/

public class Main {
    public static void main(String[] args) {


        Person darik = new Person();
        Person denisa = new Person("Denisa", 22);

        Phone sony = new Phone("+345983", "Sony", 123.5);
        Phone nokia = new Phone("+983345", "Nokia", 135.2);
        Phone redmi = new Phone("+383456", "Redmi", 152.3);

        System.out.println("______________Person_________________");
        System.out.println();
        denisa.talk();
        denisa.move();

        System.out.println();
        System.out.println("______________Phone_________________");
        System.out.println();
        sony.phonePrint();
        nokia.phonePrint();
        redmi.phonePrint();

        System.out.println();
        System.out.println("_________________PRIVATE___________________");
        System.out.println();
        System.out.println(sony.getNumber() + sony.probel + sony.getModel() + sony.probel + sony.getWeight());
        System.out.println(nokia.getNumber() + nokia.probel + nokia.getModel() + nokia.probel + nokia.getWeight());
        System.out.println(redmi.getNumber() + redmi.probel + redmi.getModel() + redmi.probel + redmi.getWeight());

        System.out.println();
        System.out.println("_________________receiveCall___________________");
        System.out.println();
        sony.receiveCall("AAA");
        nokia.receiveCall("BBB");
        redmi.receiveCall("CCC");

    }
}

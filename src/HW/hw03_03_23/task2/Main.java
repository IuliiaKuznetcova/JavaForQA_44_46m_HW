package HW.hw03_03_23.task2;

/*Создайте логически правильную иерархию для классов Пожарный, Полицейский, Человек, Работник, Врач.
Поместите в Вашу иерархию метод void work(). Подумайте, в каких классах должен быть этот метод,
где он должен быть абстрактным, а где иметь конкретную реализацию. Напишите конкретную реализацию
этого метода там, где это необходимо (пусть метод просто что-то выводит в консоль).
В классе Main создайте три разных объекта Ваших классов и продемонстрируйте проявление полиморфизма,
когда метод отрабатывает по-разному в зависимости от типа объекта.*/

public class Main {
    public static void main(String[] args) {


        Worker worker = new Policeman();
        //Doctor doctor = new Doctor();
        Worker worker1 = new Fireman();

        Doctor doctor = new Doctor("Alex", 51);
        Fireman fireman = new Fireman("Bob", 27);
        Policeman policeman = new Policeman("Hanna", 35);

        System.out.println();
        System.out.println("____________Doctor_____________");
        System.out.println();


        System.out.println(doctor.getName() + doctor.getPlaceOfWork() + "He is " + doctor.getAge());
        doctor.work();
        doctor.gender(false);


        System.out.println();
        System.out.println("____________Fireman_____________");
        System.out.println();


        System.out.println(fireman.getName() + fireman.getPlaceOfWork() + " He is " + fireman.getAge());
        fireman.work("Berlin");
        fireman.gender(false);

        System.out.println();
        System.out.println("____________Policeman_____________");
        System.out.println();


        System.out.println(policeman.getName() + policeman.getPlaceOfWork() + " She is " + policeman.getAge());
        policeman.work(10);
        policeman.gender(true);
    }
}

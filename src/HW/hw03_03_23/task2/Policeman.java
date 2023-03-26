package HW.hw03_03_23.task2;

public class Policeman extends Worker{

    private String placeOfWork = " keeps order.";
    public String name;
    public int age;

    public Policeman() {
    }

    public Policeman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }
    public String getPlaceOfWork() {
        return placeOfWork;
    }
}

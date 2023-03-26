package HW.hw03_03_23.task2;

public class Doctor extends Worker {

    private String placeOfWork = " works in a hospital.";
    public String name;



    public int age;

    public Doctor() {
    }

    public Doctor(String name, int age) {
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

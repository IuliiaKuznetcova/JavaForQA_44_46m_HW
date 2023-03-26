package HW.hw03_03_23.task2;

public class Fireman extends Worker  {
    private String placeOfWork = " puts out fires.";
    public String name;
    public int age;

    public Fireman() {
    }

    public Fireman(String name, int age) {
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

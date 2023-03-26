package HW.hw03_03_23.task1;

public class Cow extends Herbivore implements chew{

    String name;


    @Override
    public void chew() {
        System.out.println("They chew food");
    }
}

package HW.hw03_03_23.task1;

public class Tiger extends Carnivore {


    public boolean chewsGrass;


    public void chewsGrass(boolean Tasty) {
        if (Tasty) {
            System.out.println("It is Carnivore");
        } else {
            System.out.println("It is Herbivore");
        }

    }
}

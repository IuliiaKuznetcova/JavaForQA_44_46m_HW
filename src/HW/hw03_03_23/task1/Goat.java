package HW.hw03_03_23.task1;

public class Goat extends Herbivore{

    public void chewsGrass (String name) {
        System.out.println(name + " chews Grass");
    }

    public void chewsGrass (boolean Tasty) {
        if (Tasty) {
            System.out.println("It is Carnivore");
        }else {
            System.out.println("It is Herbivore");
        }
    }
}

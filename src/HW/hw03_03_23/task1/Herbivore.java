package HW.hw03_03_23.task1;

public class Herbivore extends Animal {

    @Override
    public void move() {
        System.out.println("Walk slowly");
    }

    public void eating() {
    }

    public boolean chewsGrass;

    public Herbivore() {
        this.chewsGrass = true;
    }
}

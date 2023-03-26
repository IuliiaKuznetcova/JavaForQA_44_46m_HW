package HW.hw03_03_23.task1;

/*Даны классы - Herbivore, Cheetah, Cow, Carnivore, Tiger, Animal, Goat.
Создайте логически правильную иерархию наследования, нужные классы сделайте абстрактными.*/

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("_______polymorphism___________");
        System.out.println();
        Carnivore carnivore1 = new Tiger();
        Herbivore herbivore1 = new Cow();
        carnivore1.move();
        herbivore1.move();

        System.out.println();
        System.out.println("_______overiding___________");
        System.out.println();

        Tiger tiger = new Tiger();
        Cheetah cheetah = new Cheetah();
        tiger.eating();
        cheetah.eating();

        System.out.println();
        System.out.println("_______overlaading___________");
        System.out.println();

        Goat goat = new Goat();
        goat.chewsGrass("Goat");
        goat.chewsGrass(true);
        tiger.chewsGrass(false);

        System.out.println();
        System.out.println("_______interface___________");
        System.out.println();

        Cow cow = new Cow();
        cow.chew();
    }
}

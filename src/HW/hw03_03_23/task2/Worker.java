package HW.hw03_03_23.task2;

public class Worker extends Human{


    @Override
    public void work() {
        System.out.println("Helps people");
    }

    public void work(String city) {
        System.out.println("Work in " + city);
    }

    public void work(int i) {
        System.out.println("Work " + i + " years.");
    }

    public void gender (boolean She
    ) {
        if (She) {
            System.out.println("She is a Worker");
        }else {
            System.out.println("He is a Worker");
        }
    }
}

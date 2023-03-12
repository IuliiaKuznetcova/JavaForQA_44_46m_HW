package HW.hw24_02_23;

public class Phone {
    private String number;
    private String model;
    private double weight;

    String probel = " ";

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void phonePrint() {
        System.out.println(number + probel + model + probel + weight);
    }

public String getModel () {
        return model;
}

public String getNumber() {
        return number;
}

public double getWeight () {
        return weight;
}

public void receiveCall (String callerName) {
    System.out.println("Звонит" + probel + callerName + probel + getNumber());
}

}


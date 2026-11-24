
class Car extends Vehicle {
    String modelName;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
    }
}

public class Vehicle {
    String brand;

    void honk() {
        System.out.println("Beep! Beep!");
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.brand = "BMW";
        c.modelName = "X5";

        c.honk();
        c.displayDetails();
    }
}

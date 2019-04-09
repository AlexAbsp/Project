package Lesson6;

public class Car {
    // fields
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;


    // constructors


    public Car(int price, int yearOfManufacturing, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;
    }

    // methods
    void startRun() {
        System.out.println("I am running....");
    }

    void stopRun() {
        System.out.println("I am stopping....");
    }

    void changeOwner(String newOwnerName) {

        ownerName = newOwnerName;
    }

}


package Lesson10Home;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ann", "Киев", "Женский");
        Customer customer2 = new Customer("Ann", "Киев", "Женский");
        Customer customer3 = new Customer("Jack", "Одесса", "Мужской");
        Customer customer4 = new Customer("Anton", "Днепр", "Мужской");
        Customer customer5 = new Customer("Oleg", "Харьков", "Мужской");

        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("radio", null, "Киев", "Днепр", 200, customer1, 3);
        ElectronicsOrder electronicsOrder2 = new ElectronicsOrder("mouse", null, "Одесса", "Днепр", 2000, customer2, 3);

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("table", null, "Киев", "Днепр", 6000, customer3, "Blue");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("desk", null, "Одесса", "Харьков", 200, customer4, "Red");

        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();

        electronicsOrder2.validateOrder();
        electronicsOrder2.calculatePrice();
        electronicsOrder2.confirmShipping();

        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();

//        furnitureOrder2.validateOrder();
//        furnitureOrder2.calculatePrice();
//        furnitureOrder2.confirmShipping();


    }
}

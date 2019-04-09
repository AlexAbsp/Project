package Lesson8.phones;

public class IPhone extends Phone{


    boolean fingerPrint;

    public IPhone(int price, double weight, String coutryProduced, boolean fingerPrint) {

        super(price, weight, coutryProduced);

        System.out.println("IPhone consructor was invoked...");
        this.fingerPrint = fingerPrint;
    }


    void deleteIFhoneFromDb(){
        System.out.println("deleteIFhoneFromDb invoked...");
    }
}

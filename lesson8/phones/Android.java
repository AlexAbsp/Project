package Lesson8.phones;

public class Android extends Phone {
    int price;
    double weight;
    String coutryProduced;

    String androidVersion;
    int screenSize;
    String secretDeviseCode;

    public Android(int price, double weight, String coutryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
            //  this.price = price;
            // this.weight = weight;
            // this.coutryProduced = coutryProduced;
        super(price, weight, coutryProduced);
            // this - reference to the current class object
            // super - reference to the parent class object

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }
    /*    void orderFhone(){
        // some logic
    }                                      */
    void instalNewAndroidVersion(){
        System.out.println("instalNewAndroidVersion invoked...");
    }
}

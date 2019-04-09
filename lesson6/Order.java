package Lesson6;

import java.util.Date;

public class Order {



    long id;
    public int price;
    public Date dateCreated;
    public boolean isConfirmed;
    public Date dateConfirmed;
    public String city;
    public String country;
    public String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

   public void confirmOrder() {

        if (isConfirmed != true) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }

    }

    public boolean checkPrice() {
        if (price > 1000) {
            isConfirmed = true;
        } else {
            isConfirmed = false;
        }
        return isConfirmed;


    }

   public boolean isValidType() {

        if (type == "Buy") {
            isConfirmed = true;
        } else {
            isConfirmed = false;
        }
        return isConfirmed;

    }
}

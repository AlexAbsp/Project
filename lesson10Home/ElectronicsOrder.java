package Lesson10Home;

import java.util.Date;

public  class  ElectronicsOrder extends Order{
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
   public void validateOrder() {
        String cityFrom = getShipFromCity();
        String cityTo = getShipToCity();

        if ((cityFrom == "Киев" || cityFrom == "Одесса" || cityFrom =="Днепр" || cityFrom =="Харьков") && (cityTo == "Киев" || cityTo == "Одесса" || cityTo =="Днепр" || cityTo =="Харьков") && (getBasePrice() >= 100) && (getCustomerOwned().getGender() == "Женский"))

            setDateConfirmed(new Date());
    }

    @Override
    public void calculatePrice() {
        String cityTo = getShipToCity();

       double basePrice = (double) getBasePrice();


        if (cityTo  == "Киев" || cityTo  == "Одесса")
            basePrice += basePrice * 0.1;
        else
            basePrice += basePrice * 0.15;
        if (basePrice >= 1000)
            basePrice -= basePrice * 0.05;
        setTotalPrice(basePrice);

    }
}

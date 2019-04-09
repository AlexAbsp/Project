package Lesson7;

import Lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {
        createOrder();
        createOrderAndCallMethods();

    }

    static Order createOrder() {

        Order order1 = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        order1.checkPrice();

        return order1;
    }

    static Order createOrderAndCallMethods() {

        Order order2 = createOrder();
        order2.confirmOrder();
        order2.isValidType();
        order2.type = "SomeValue";
        order2.city = "Kiev";

        return order2;
    }

}



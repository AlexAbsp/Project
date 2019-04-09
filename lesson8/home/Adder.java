package Lesson8.home;

public class Adder extends Arithmetic {

    long sum;



    long add(int a, int b) {

        sum = (long)a + (long)b;
        return  sum;
    }
}

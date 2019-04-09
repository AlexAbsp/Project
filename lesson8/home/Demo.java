package Lesson8.home;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 100};

        Adder adder1 = new Adder();

        adder1.add(2, 5);
        adder1.check(array);

        System.out.println(adder1.sum);
        System.out.println(adder1.res);


    }
}

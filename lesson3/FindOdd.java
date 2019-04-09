package Lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int sum = 1;
        for (a = 1; a <= 1000; a = a + 2){
            System.out.println("Found");
            sum += a;
        }
        if (sum * 5 > 5000) {
            System.out.println("Bigger");
        }
        else {
            System.out.println("Smaller");
        }

        System.out.println(sum);
    }
}

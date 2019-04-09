package Lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 1000){
            sum += a;
            a++;
        }
        int c1;
        int c2;
        c1 = sum / 1234;
        c2 = sum % 1234;
        for (; c1 < c2;) {
            System.out.println("true");
            break;
        }
        for (; c1 > c2;) {
            System.out.println("false");
            break;
        }
    }
}

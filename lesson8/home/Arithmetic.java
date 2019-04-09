package Lesson8.home;

public class Arithmetic {

    boolean res;



    boolean check(int[] array) {

        int max = maxElement(array);
        int min = minElement(array);
        long sum = max + min;
        if (sum > 100)
            res = true;
        else
            res = false;
        return res;
    }

    int maxElement(int[] array) {
        int max = array[0];
        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    int minElement(int[] array) {
        int min = array[0];
        for (int el : array) {
            if (el < min)
                min = el;
        }
        return min;
    }
}

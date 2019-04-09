package Lesson4;

public class SravnenieSum {
    public static void main(String[] args) {

        System.out.println(compareSums(3,4,3,5));
    }

    public static boolean compareSums(int a, int b, int c, int d){
        long summa1 = sum(a, b);
        long summa2 = sum(c, d);
        boolean result = summa1 > summa2 ? true : false;
      /*  if (summa1 > summa2)
            result = true;
        else
            result = false;  */
        return result;
    }


    public static long sum(int from, int to){
       /* int summa = 0;
        for(int i = from; i <= to; i++){
            summa += i;
        }
        */
         long i = from;
         long summa = 0;
        while (i <= to) {
            summa += i;
            i++;
        }
        return summa;

    }
}

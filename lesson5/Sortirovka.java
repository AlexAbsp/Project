package Lesson5;

import java.util.Arrays;

public class Sortirovka {
    public static void main(String[] args) {
        int[] massiv = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(Arrays.toString(sortAscending(massiv)));
        System.out.println(Arrays.toString(sortDescending(massiv)));
    }

   static int[] sortAscending(int[] array)
    {
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

         return array;
    }
    static int[] sortDescending(int[] array)
    {
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        return array;
    }

}

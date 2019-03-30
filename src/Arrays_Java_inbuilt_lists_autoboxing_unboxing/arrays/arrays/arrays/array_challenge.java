package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_challenge
{

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myInteger = getInteger(3);
        int[] sorted = sortIntegers(myInteger);
        printInteger(sorted);





    }

    public static int[] getInteger(int number)
    {
        System.out.println("please input " + number +  " numbers: ");
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        return  arr;
    }

    public static void printInteger(int[] array)
    {

        for (int i =0; i < array.length; i++)
        {
            System.out.println("element " + i + " has " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array)
    {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++)
//        {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag)
        {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++);
            {
//                if (sortedArray[i] < sortedArray[i+1])
//                {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
            }
        }

        return sortedArray;
    }


}
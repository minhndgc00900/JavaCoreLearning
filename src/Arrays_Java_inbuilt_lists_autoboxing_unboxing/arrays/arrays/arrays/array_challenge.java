package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array_challenge
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] myInts =  getInteger(3);

        printArray(myInts);

//        for (int i = 0; i < myInts.length; i++)
//        {
//            sorting(myInts[i]);
//        }

    }

    public static int[] getInteger(int number)
    {
        System.out.println("please type " + number + " numbers: ");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++)
        {
           values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void sorting(int[] array) {
        for (int i = array.length - 1; i>=0; i--)
        {
            System.out.println("The element " + i + " has value" + array[i]);
        }
    }
}

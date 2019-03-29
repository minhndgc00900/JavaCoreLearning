package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;


import java.util.Scanner;

public class arrayScanner
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] getInts = getInteger(5);

        for (int i = 0; i < getInts.length; i++)
        {
            System.out.println("element is " + i + " type valuse was " + getInts[i]);
        }
        System.out.println("The average is " + getAverage(getInts));
    }

    public static int[] getInteger(int number)
    {
        System.out.println("Enter " + number + " numbers: ");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++)
        {
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static double getAverage(int[] array)
    {
       double sum = 0;
       for (int i = 0; i < array.length; i++)
       {
           sum += array[i];
       }

       return sum / array.length;
    }
}

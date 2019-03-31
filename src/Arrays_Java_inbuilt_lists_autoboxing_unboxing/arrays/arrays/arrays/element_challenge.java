package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class element_challenge
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] ri = readingIntegers(4);

        System.out.println(Arrays.toString(ri));
        System.out.println("The min is " + findMin(ri));
    }

    public static int[] readingIntegers(int count)
    {
        System.out.println("Enter " + count + " numbers: ");

        int[] array = new int[count];
        for (int i = 0; i < count; i++)
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }

//    public static int findMin(int[] array)
//    {
//        for (int i = 0; i < array.length; i++)
//        {
//            if (array[i] < maxValue)
//            {
//                maxValue = array[i];
//            }
//        }
//        return maxValue;
//    }

    public static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
}

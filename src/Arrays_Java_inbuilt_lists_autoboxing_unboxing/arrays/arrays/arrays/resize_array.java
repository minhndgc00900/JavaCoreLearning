package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class resize_array
{
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];
    public static void main(String[] args)
    {
        System.out.println("Enter 10 numbers:");
        inputNumber();
        showArray(baseData);
        resize();
//        System.out.println("Enter 12 numbers:");
//        inputNumber();
        baseData[10] = 59;
        baseData[11] = 61;
        showArray(baseData);

    }

    private static int[] inputNumber()
    {
        for (int i=0; i < baseData.length; i++)
        {
            baseData[i] = scanner.nextInt();
        }
        return baseData;
    }

    private static void showArray(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    private static void resize()
    {
        int[] original = baseData;
        baseData = new int[12];
        for (int i=0; i < original.length; i++)
        {
            baseData[i] = original[i];
        }

        System.out.println(Arrays.toString(baseData));
    }

}

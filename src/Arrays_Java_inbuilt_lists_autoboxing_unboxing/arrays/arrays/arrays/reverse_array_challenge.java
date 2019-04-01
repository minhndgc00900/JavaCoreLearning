package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

import com.sun.deploy.util.ArrayUtil;


import java.util.Arrays;

public class reverse_array_challenge
{
    public static void main(String[] args)
    {
        int[] array = new int[]{3,4,1,7};
        reverse(array);

    }

    public static void reverse(int[] array)
    {

        int haftLength = array.length/2;
        int maxIndex = array.length - 1;
        for(int i = 0; i < haftLength; i++)
        {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}

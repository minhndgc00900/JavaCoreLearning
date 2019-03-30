package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

import java.util.Arrays;

public class reference_type
{
    public static void main(String[] args)
    {
        //(value type) kieu tham tri
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b++;

        System.out.println("the updated a " + a);
        System.out.println("the updated b " + b + "\n");

        //(reference type) kieu tham chieu

        int[] arrA = new int[5];
        int[] arrB = arrA;

        System.out.println("array A = " + Arrays.toString(arrA)); //[0,0,0,0,0]
        System.out.println("array B = " + Arrays.toString(arrB)); //[0,0,0,0,0]

        arrB[1] = 29;

        System.out.println("updated array A = " + Arrays.toString(arrA)); //[0,29,0,0,0]
        System.out.println("updated array B = " + Arrays.toString(arrB) + "\n"); //[0,29,0,0,0]

        arrB[1] =14;

        System.out.println("updated array A 2nd = " + Arrays.toString(arrA)); //[0,14,0,0,0]
        System.out.println("updated array B 2nd = " + Arrays.toString(arrB) + "\n"); //[0,14,0,0,0]

        arrB[2] =15;

        System.out.println("updated array A 3rd = " + Arrays.toString(arrA)); //[0,14,15,0,0]
        System.out.println("updated array B 3rd = " + Arrays.toString(arrB) + "\n"); //[0,14,15,0,0]

        arrB = new int[]{4,1,44,21,52};

        System.out.println("updated array A 4th = " + Arrays.toString(arrA)); //[0,14,15,0,0]
        System.out.println("updated array B 4th = " + Arrays.toString(arrB) + "\n"); //[4,1,44,21,52]

        int[] arrC = new int[5];

        modifyArray(arrC); //[4,5,12,51,21]
        System.out.println("modifyArray = " + Arrays.toString(arrC) + "\n"); //[2,0,0,0,0]

    }

    private static void modifyArray(int[] array)
    {
        array[0] = 2;
        array = new int[]{4,5,12,51,21};
        System.out.println("modifyArray = " + Arrays.toString(array) + "\n"); //[4,5,12,51,21]

    }
}

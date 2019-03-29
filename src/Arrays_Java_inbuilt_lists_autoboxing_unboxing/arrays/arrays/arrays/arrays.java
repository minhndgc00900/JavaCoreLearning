package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays;

public class arrays
{
    public static void main(String[] args)
    {
//
//        myIntArray[0] = 45;
//        myIntArray[1] = 135;
//        myIntArray[5] = 50;

        int[] intArray = {11,3,42,7,1,8,77,99,16,10}; //define 10 elements for an array
        double[] myDoubleArray = new double[10];
        System.out.println(intArray[5]);
        System.out.println(intArray[0]);
        System.out.println(intArray[8]);
        //System.out.println(intArray[33]); //<= Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        int[] myIntArray = new int[10]; //<= ten elements

        //myIntArray.length will help AVOID causing errors about number of value =>
        //do not match with element in array, normally, the exception will be "java.lang.ArrayIndexOutOfBoundsException"

        for (int x = 0; x < myIntArray.length; x++)
        {
            myIntArray[x] = x*10;
        }

        printArray(myIntArray);

    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }
}

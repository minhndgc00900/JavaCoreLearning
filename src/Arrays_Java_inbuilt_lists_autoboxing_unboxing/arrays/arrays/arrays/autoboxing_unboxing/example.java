package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.autoboxing_unboxing;

import java.util.ArrayList;

public class example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 100; i < 110; i++)
        {
             arrayList.add(Integer.valueOf(i)); //converting from "int" type to Integer

        }

        System.out.println(arrayList);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + " => " + arrayList.get(i).intValue()); //<= converting from Integer to "int" type
        }

        Integer integer = new Integer(42);
        Integer integer1 = 35; //Integer.valueOf(35); (int to Integer)


        System.out.println(integer + " and " + integer1);

        int myInt = integer; //integer1.intValue() (Integer to int)


    }
}

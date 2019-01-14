public class floatAndDouble
{
    public static void main(String[] args)
    {
        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5d / 3d;

        //we should use double instead of float
        //because double is faster and more accurate than float
        System.out.println("my int is " + myIntVal);
        System.out.println("my float is " + myFloatVal);
        System.out.println("my double is " + myDoubleVal);

        double onepound = 12d;
        double convert_to_kg = onepound * 0.45359237d / 1d;
        System.out.println(convert_to_kg);
    }
}

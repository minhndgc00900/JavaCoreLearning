package variable_datatype_operator;

public class string
{
    public static void main(String[] args)
    {
        String b = "2";
        double c = 3.33d;
        b += c; //b = b + c
        String str1 = "minh";
        String age  = "23";
        String sentence = "my name is " + str1 + " Im " + age;
        String copyright = "\u00A9 2019";
        System.out.println(sentence);
        System.out.println(copyright);

        //we cannot calculate two values if
        // they are or one of them is variable_datatype_operator.string
        System.out.println(b + age);
        System.out.println(b);
    }
}

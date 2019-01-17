package variable_datatype_operator;

public class charAndBoolean
{
    public static void main(String[] args)
    {
        //with char, can only put one type of character
        //for example, it is incorrect if the var has
        //the value like this 't%'. However, it is allowed
        //to use unicode
        char myChar = '\u00A9'; //one example of using unicode, the result is ©
        System.out.println(myChar);

        //boolean can only true or false;
        boolean myB = false;


    }
}

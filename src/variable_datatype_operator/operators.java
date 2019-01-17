package variable_datatype_operator;

public class operators
{
    public static void main(String[] args)
    {
        //An operator is the ‘function’ that performs the operation,
        // whereas the operand is the input to that function.
        // In the expression 3 + 4 = 7, the operator is ‘+’
        // - since it’s telling us how to perform the operation
        // - and the operands are 3 and 4
        // - the inputs upon which the operation is acting.
        int result = 1 + 2;
        System.out.println(result);

        int previous = result;
        result -= 1;
        System.out.println("the new one now is " + result + " the previous one is " + previous);

        previous = result;
        result = result * 5;
        System.out.println("the new one now is " + result + " the previous one is " + previous);

        //get remainder (lay so du)
        previous = result;
        result = result % 3;
        System.out.println("the new one now is " + result + " the previous one is " + previous);

        //shortcut
        previous = result;
        result++; //result = result + 1;
        System.out.println("the new one now is " + result + " the previous one is " + previous);

        previous = result;
        result += 3; //result = result + 3;
        System.out.println("the new one now is " + result + " the previous one is " + previous);

        boolean isAlien = false;


        if (isAlien == false)
        {
            System.out.println("its true");
        }

        //ternary operator
        int a = -11;
        String isNumber = (a > 0) ? "yes, a is higher than 0" : "no, 0 is higher";
        System.out.println(isNumber);

        //another example of ternary operator, this example won't show the result becaus
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("wasCar is false");
        }

        //another example
        int x = 1;
        boolean answer = (x > 0) ? true : false;

        if (answer)
        {
            System.out.println("its true");
        }

        //challenge
        double val1 = 20d;
        double val2 = 80d;
        double sum1 = (val1 + val2) * 25d;
        double getR = sum1 % 40d;
//        System.out.println(getR);
        if (getR == 20 || getR < 20)
        {
            System.out.println("total was over the limit");
        }

    }
}

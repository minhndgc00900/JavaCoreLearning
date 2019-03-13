package control_flow_statement;

public class digit_sum_challenge
{
    public static void main(String[] args) {
        int n = 34;
        System.out.println("sum of digits of " + n + " is " + sumDigits(n));
    }

    private static int sumDigits(int number)
    {
        if (number < 10)
        {
            return -1;
        }

        while (number > 0)
        {
            int a = number % 10;
            int b = number/ 10;
            int sum = a + b;
//            number++;
            return sum;

        }

        return -1;
    }
}

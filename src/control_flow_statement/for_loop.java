package control_flow_statement;

public class for_loop
{
    public static void main(String[] args)
    {
        for (int i = 2 ; i < 9; i++)
        {
            System.out.println(calculateInterest(10000, i));
        }

        int count = 0;
        for (int ii = 10; ii < 50; ii++)
        {
            if (isPrime(ii))
            {
                count++;
                System.out.println(ii);
                if (count == 3)
                {
                    System.out.println("exiting");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate/100));
    }

    //challenge
    public static boolean isPrime(int n)
    {
        if (n == 1)
        {
            return false;
        }

        for (int i=2; i <= n/2; i++)
        {
            if (n % 1 == 0)
            {
                return false;
            }
        }

        return true;
    }




}

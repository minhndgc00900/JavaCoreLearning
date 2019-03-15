package control_flow_statement;

import java.util.Scanner;

public class minimum_and_maximum_challenge
{

    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt)
            {
                break;
            }
            int number = scanner.nextInt();

            if (number > min)
            {
                min = number;
            }

            if (number < max)
            {
                max = number;
            }

        }

        System.out.println("the minimum number is: " + min);
        System.out.println("the maximum number is: " + max);

    }
}

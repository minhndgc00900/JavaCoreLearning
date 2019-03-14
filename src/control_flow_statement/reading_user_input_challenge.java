package control_flow_statement;

import java.util.Scanner;

public class reading_user_input_challenge
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true)
        {
            int order = count + 1;

            System.out.println("Enter number " + order + " :");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt)
            {
                count++;
                int number = scanner.nextInt();
                sum = sum + number;
                if (count == 10)
                {
//                    System.out.println("sum is " + sum);
                    break;
                }
            }
            else
            {
                System.out.println("invalid");
                break;
            }
            scanner.nextLine();


        }
        System.out.println("sum is " + sum);
        scanner.close();


    }
}

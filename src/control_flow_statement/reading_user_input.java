package control_flow_statement;

import java.util.Scanner;

public class reading_user_input
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your DOB: ");
        boolean hasNextInt = scanner.hasNextInt(); //This function reads the input given and checks whether it is an integer type input or not

        if (hasNextInt)
        {
            int inputDOB = scanner.nextInt(); //method of a Scanner object reads in a string of digits (characters) and converts them into an int type
            int age = 2019 - inputDOB;
            scanner.nextLine(); //handle the next line character (Enter key)
            System.out.println("Enter Your Name: ");
            String inputName = scanner.nextLine();

            if (inputDOB < 2019 && inputDOB > 1900)
            {
                System.out.println("your name is " + inputName + " and you are " + age + " years old");
            }
            else
            {
                System.out.println("invalid age");
            }
        }
        else
        {
            System.out.println("invalid age");
        }

        scanner.close();
    }
}

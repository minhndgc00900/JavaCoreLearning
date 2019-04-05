package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static Scanner scanner = new Scanner(System.in);
    public static mobilePhone mobilePhone = new mobilePhone();
    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;

        while (!quit)
        {
            menu();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    menu();
                    break;
                case 1:
                    mobilePhone.viewAll();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }

    public static void menu()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice");
        System.out.println("\t 1 - To print list of contact");
        System.out.println("\t 2 - To add a contact");
        System.out.println("\t 3 - To update a contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To copy all items");
        System.out.println("\t 7 - To quit");
    }

    public static void add()
    {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number ");
        int number = scanner.nextInt();
        scanner.nextLine();
        Contact contact = Contact.createContact(name,number);
        if (mobilePhone.addNewContact(contact))
        {
            System.out.println("A new contact has been added");
        }
        else
        {
            System.out.println("Existed");
        }
    }

    public static void update()
    {
        System.out.println("Enter name of contact: ");
        String oldContact = scanner.nextLine();
        Contact existContactrecord = mobilePhone.queryContact();
        System.out.println("Enter new name:  ");
        String newName = scanner.nextLine();

    }

}

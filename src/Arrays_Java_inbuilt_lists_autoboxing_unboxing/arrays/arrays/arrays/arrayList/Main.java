package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static arrayList arrayList = new arrayList();
    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;
        while (!quit)
        {
            printInstruction();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    arrayList.printGroceryList();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }


    }

    public static void printInstruction()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice");
        System.out.println("\t 1 - To print list of item");
        System.out.println("\t 2 - To add an item");
        System.out.println("\t 3 - To update an item");
        System.out.println("\t 4 - To remove an item");
        System.out.println("\t 5 - To search for an item");
        System.out.println("\t 6 - To copy all items");
        System.out.println("\t 7 - To quit");
    }

    public static void add()
    {
        System.out.println("please input name of item: ");
        arrayList.addGroceryItem(scanner.nextLine());
    }

    public static void update()
    {
        System.out.println("please input name of current item: ");
        String currentItem = scanner.nextLine();
        System.out.println("please input name of new item ");
        String newItem = scanner.nextLine();
        arrayList.modifyGloceryItems(currentItem, newItem);
    }

    public static void delete()
    {
        System.out.println("please input name of item: ");
        arrayList.removeGroceryItem(scanner.nextLine());
    }

    public static void search()
    {
        System.out.println("plese input name of item: ");
        String name = scanner.nextLine();
        if (arrayList.findIfExist(name))
        {
            System.out.println("we found " + name);
        }
        else
        {
            System.out.println("can't find anything");
        }
    }

    //copy arraylist
    public static void processArrayList()
    {
//        ArrayList newArray = new ArrayList<String>(arrayList.getGroceryList()); //create new array
//        newArray.addAll(arrayList.getGroceryList());
//        String[] ndewArray = arrayList.getGroceryList().toArray(newArray);
//
//        String[] myArray = new String[arrayList.getGroceryList().size()];
//        myArray = arrayList.getGroceryList().toArray(myArray);
//        System.out.println(newArray);
    }

}


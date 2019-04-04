package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList;

import java.sql.Array;
import java.util.ArrayList;

public class arrayList
{
    //create an arrayList and the elements in this case =>
    //are gonna be type of string
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public void printGroceryList()
    {
        System.out.println("we have " + groceryList.size() + " item(s) in the list");
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println(i + ". " + groceryList.get(i));
        }
    }


    public void modifyGloceryItems(String currentItem, String newItem)
    {
        int position = findItems(currentItem);
        if (position>=0)
        {
            modifyGloceryItems(position, newItem);
        }
    }

    private void modifyGloceryItems(int position, String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Glocery items " + position + " has been modified");

    }

    public void removeGroceryItem(String item)
    {
        int position = findItems(item);
        if (position>=0)
        {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position)
    {
//        String theItems = groceryList.get(position);
        groceryList.remove(position);
    }

    public boolean findIfExist(String searchItem)
    {
        int position = findItems(searchItem);
        if (position >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private int findItems(String searchItem)
    {
        //boolean exists = groceryList.contains(searchItem);

        return groceryList.indexOf(searchItem);

//        if (position >= 0)
//        {
//            return groceryList.get(position);
//        }
//
//        return null;
    }
}

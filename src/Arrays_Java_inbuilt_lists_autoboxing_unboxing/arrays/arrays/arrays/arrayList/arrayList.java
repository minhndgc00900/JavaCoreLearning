package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList;

import java.sql.Array;
import java.util.ArrayList;

public class arrayList
{
    //create an arrayList and the elements in this case =>
    //are gonna be type of string
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public void printGroceryList()
    {
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println(i + ". " + groceryList.get(i));
        }
    }

    public void modifyGloceryItems(int position, String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Glocery items " + position + " has been modified");

    }

    public void removeGroceryItem(int position)
    {
        String theItems = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItems(String searchItem)
    {
        //boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);

        if (position >= 0)
        {
            return groceryList.get(position);
        }

        return null;
    }
}

package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.autoboxing_unboxing.challenge;

import Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList.challenge.Contact;

import java.util.ArrayList;

public class Branches
{
    private String name;
    private ArrayList<Customers> cusArray;

    public Branches(String name) {
        this.name = name;
        this.cusArray = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public boolean addCustomer(String cusName , double amount)
    {

        if (findCustomer(cusName) != null)
        {
            return false;
        }
        else
        {
            this.cusArray.add(new Customers(cusName, amount));
            return true;
        }
    }

//    public boolean updateCustomer(Customers oldCus, Customers newCus)
//    {
//        int getCustomerPostion = findCustomer(oldCus);
//        if (getCustomerPostion >= 0)
//        {
//            this.customers.set(getCustomerPostion, newCus);
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }


    public boolean addCustomerTransaction(String cusName, double amount)
    {
        Customers existCus = findCustomer(cusName);

        if (existCus != null)
        {
            existCus.addTransaction(amount);
            return true;
        }
        else
        {
            return false;
        }
    }

    public int findCustomer(Customers customer)
    {
        return this.cusArray.indexOf(customer);
    }

    public Customers findCustomer(String nameofCustomer)
    {

        for (int i = 0; i < this.cusArray.size(); i++)
        {
            Customers customers = this.cusArray.get(i);
            if (customers.getName().equals(nameofCustomer))
            {
                return customers;
            }
        }
        return null;
    }
}

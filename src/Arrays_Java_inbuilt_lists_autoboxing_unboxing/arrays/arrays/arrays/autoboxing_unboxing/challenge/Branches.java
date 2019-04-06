package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.autoboxing_unboxing.challenge;

import Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList.challenge.Contact;

import java.util.ArrayList;

public class Branches
{
    private ArrayList<Customers> customers;

    public Branches() {
        this.customers = new ArrayList<Customers>();
    }

    public boolean addCustomer(Customers customers)
    {
        String nameofCustomer = customers.getName();
        if (findCustomer(nameofCustomer) >= 0)
        {
            return false;
        }
        else
        {
            this.customers.add(customers);
            return true;
        }
    }

    public boolean updateCustomer(Customers oldCus, Customers newCus)
    {
        int getCustomerPostion = findCustomer(oldCus);
        if (getCustomerPostion >= 0)
        {
            this.customers.set(getCustomerPostion, newCus);
            return true;
        }
        else
        {
            return false;
        }
    }

    public int findCustomer(Customers customer)
    {
        return this.customers.indexOf(customer);
    }

    public int findCustomer(String nameofCustomer)
    {

        for (int i = 0; i < this.customers.size(); i++)
        {
            Customers customers = this.customers.get(i);
            if (customers.getName().equals(nameofCustomer))
            {
                return i;
            }
        }
        return -1;
    }
}

package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.autoboxing_unboxing.challenge;

import Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList.challenge.Contact;

import java.util.ArrayList;

public class branches
{
    private ArrayList<customers> customers;

    public branches() {
        this.customers = new ArrayList<customers>();
    }

    public boolean addnewCustomer(customers customer)
    {
        String nameofcustomer = customer.getName();

        if (findCustomer(nameofcustomer) > 0)
        {
            return false;
        }
        this.customers.add(customer);

        return true;
    }



    public int findCustomer(customers customer)
    {
        return this.customers.indexOf(customer);
    }

    public int findCustomer(String nameofcustomer)
    {
        for (int i = 0; i < this.customers.size(); i++)
        {
            customers customer = this.customers.get(i);
            if (customer.getName().equals(nameofcustomer))
            {
                return i;
            }
        }
        return -1;

    }
}

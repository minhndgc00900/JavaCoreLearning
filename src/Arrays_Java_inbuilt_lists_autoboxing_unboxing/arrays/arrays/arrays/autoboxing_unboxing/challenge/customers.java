package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.autoboxing_unboxing.challenge;

import java.util.ArrayList;

public class customers
{
    private String name;
    private ArrayList<Double> transaction;

    public customers(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount)
    {
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }


    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public static customers createCustomers(String name, double amount)
    {
        return new customers(name, amount);
    }
}

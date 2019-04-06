package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.autoboxing_unboxing.challenge;

import java.util.ArrayList;

public class Customers
{
    private String name;
    private ArrayList<Double> transaction;

    public Customers(String name, Double initialMoney) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialMoney);
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


}

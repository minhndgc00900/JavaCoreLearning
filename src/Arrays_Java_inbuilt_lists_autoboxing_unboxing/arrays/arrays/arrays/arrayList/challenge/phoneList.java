package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList.challenge;

import java.util.ArrayList;

public class phoneList
{
    private String name;
    private int phoneNumber;

    public phoneList(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static phoneList createContact(String name, int phoneNumber)
    {
        return new phoneList(name, phoneNumber);
    }

    private ArrayList<phoneList> phoneLists = new ArrayList<>();

    public void addcontact(String name, int phoneNumber)
    {
        
    }

}

package Arrays_Java_inbuilt_lists_autoboxing_unboxing.arrays.arrays.arrays.arrayList.challenge;

import java.util.ArrayList;

public class mobilePhone
{
    private ArrayList<Contact> myContacts;

    public mobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact)
    {
        if (findContact(contact.getName()) >= 0)
        {
            System.out.println("Existed");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        if (findContact(oldContact) >= 0)
        {
            myContacts.set(findContact(oldContact), newContact);
            System.out.println(oldContact.getName() + " has been replaced for " + newContact.getName());
            return true;
        }
        else
        {
            System.out.println(oldContact.getName() + " hasn't been found");
            return false;
        }
    }

    private int findContact(Contact contact)
    {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name)
    {
        for (int i = 0; i<myContacts.size(); i++)
        {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
}

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
        String nameOfcontact = contact.getName();
        if (findContact(nameOfcontact) >= 0)
        {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        int foundPosition = findContact(oldContact);

        if (foundPosition >= 0)
        {
            myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + " has been replaced for " + newContact.getName());
            return true;
        }
        else
        {
            System.out.println(oldContact.getName() + " hasn't been found");
            return false;
        }
    }

    public void viewAll()
    {
        System.out.println("there are " + myContacts.size() + " contact(s)");

        for (int i = 0; i < myContacts.size(); i++)
        {
            System.out.println(i + ". " + myContacts.get(i).getName() + " => " + myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean removeContact(Contact contact)
    {
        String nameOfcontact = contact.getName();
        if (findContact(nameOfcontact) >= 0)
        {
            myContacts.remove(findContact(contact));
            return true;
        }
        return false;
    }

    //will return the position of array of a record
    private int findContact(Contact contact)
    {
        return myContacts.indexOf(contact);
    }

    //will return the position of array by name of a record
    private int findContact(String contactName)
    {
        for (int i = 0; i<myContacts.size(); i++)
        {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) //when we compare string with string, using equal()
            {
                return i;
            }
        }
        return -1;
    }

    public int queryContactNumber(Contact contact)
    {
        if (findContact(contact) >= 0)
        {
            return contact.getPhoneNumber();
        }
        return -1;
    }

    public Contact queryContact(String name)
    {
        int position = findContact(name);
        if (position >= 0)
        {
            return  this.myContacts.get(position);
        }
        return null;
    }
}

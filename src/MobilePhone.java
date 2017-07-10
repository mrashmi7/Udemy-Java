import java.util.ArrayList;

/**
 * Created by diego on 09/07/2017.
 */
public class MobilePhone {
    private ContactList contactList = new ContactList();

    public void addContact(String name, String phoneNumber) {
        if (!isDuplicated(name, phoneNumber))
            contactList.add(new Contact(name, phoneNumber));
    }

    private boolean isDuplicated(String name, String phoneNumber) {
        if (contactList.indexOf(name) >= 0 || contactList.indexOf(phoneNumber) >= 0) {
            System.out.println("This name or phonenumber is already in the contactlist!");
            return true;
        }
        return false;
    }

    public void printContacts() {
        System.out.printf("Current amount of contacts in your mobile is %d\n", contactList.size());
        contactList.forEach((contact) -> System.out.printf("Contact: %s, %s\n", contact.getName(), contact.getPhoneNumber()));
    }

    public void deleteContact(String searchValue) {
        int contact =  contactList.indexOf(searchValue);
        if (contact >= 0)
            contactList.remove(contact);
    }

    public void modifyContact(String searchValue, String newName, String newNumber) {
        int contact =  contactList.indexOf(searchValue);
        if (contact >= 0) {
            contactList.get(contact).setName(newName);
            contactList.get(contact).setPhoneNumber(newNumber);
        }
    }

}

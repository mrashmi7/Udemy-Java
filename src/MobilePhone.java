import java.util.ArrayList;

/**
 * Created by diego on 09/07/2017.
 */
public class MobilePhone {
    private ContactList contactList = new ContactList();

    public void addContact(String name, String phoneNumber) {
        contactList.add(new Contact(name, phoneNumber));
    }

    public void printContacts() {
        System.out.printf("Current amount of contacts in your mobile is %d\n", contactList.size());
        contactList.forEach((contact) -> System.out.printf("Contact: %s, %s\n", contact.getName(), contact.getPhoneNumber()));
    }

    public void deleteContact(String searchValue) {
        int contact =  findContactIndex(searchValue);
        if (contact >= 0) {
            contactList.remove(contact);
        }
    }

    public void modifyContact(String searchValue, String newName, String newNumber) {
        int contact =  findContactIndex(searchValue);
        if (contact >= 0) {
            contactList.get(contact).setName(newName);
            contactList.get(contact).setPhoneNumber(newNumber);
        }
    }

    private int findContactIndex(String searchValue) {
        return contactList.indexOf(searchValue);
    }
}

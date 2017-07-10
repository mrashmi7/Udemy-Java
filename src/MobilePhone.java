import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by diego on 09/07/2017.
 */
public class MobilePhone {
    private ContactList contactList = new ContactList();
    private Scanner scanner = new Scanner(System.in);


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

    private String getSearchValue() {
        return scanner.nextLine();
    }
    
    public void openContactsMenu() {
        boolean opened = true;
        while (opened) {
            System.out.print("Choose your option: ");
            switch (getMenuOption()) {
                case 1: // Show contacts
                    System.out.printf("Current amount of contacts in your mobile is %d\n", contactList.size());
                    printContacts();
                    break;
                case 2: // Add contact
                    System.out.println("Option 2: ");
                    break;
                case 3: // Modify contact
                    System.out.println("Option 3: ");
                    break;
                case 4: // Remove contact
                    System.out.println("Option 4: ");
                    break;
                case 5: // Print options
                    System.out.println("Option 5: ");
                    break;
                case 6: // Close contactlist
                    opened = false;
                    break;
            }
        }
    }

    private int getMenuOption() {
        System.out.print("Select your option [1-6]: ");
        return(scanner.nextInt());
    }
}

package MobilePhone;

import java.util.Scanner;

/**
 * Created by diego on 09/07/2017.
 */
public class MobilePhone {
    private ContactList contactList = new ContactList();
    private Scanner scanner = new Scanner(System.in);

    public void openContactsMenu() {
        boolean opened = true;
        while (opened) {
            printOptions();
            switch (getMenuOption()) {
                case 1: // Show contacts
                    System.out.printf("Current amount of contacts in your mobile is %d\n", contactList.size());
                    printContacts();
                    break;
                case 2: // Add contact
                    System.out.println("Add new contact!");
                    addContact();
                    break;
                case 3: // Modify contact
                    System.out.println("Modify existing contact: ");
                    modifyContact();
                    break;
                case 4: // Remove contact
                    System.out.println("Delete existing contact: ");
                    deleteContact();
                    break;
                case 5: // Close contactlist
                    opened = false;
                    break;
            }
        }
    }

    private void printOptions() {
        System.out.println(" ___________________________");
        System.out.println("|                           |");
        System.out.println("|   1 - Show all contacts   |");
        System.out.println("|   2 - Add contact         |");
        System.out.println("|   3 - Modify contact      |");
        System.out.println("|   4 - Delete contact      |");
        System.out.println("|   5 - Close ContactList   |");
        System.out.println("|___________________________|");

    }

    private int getMenuOption() {
        System.out.print("Select your option [1-5]: ");
        return (scanner.nextInt());
    }

    private void printContacts() {
        contactList.forEach((contact) -> System.out.printf("Contact: %s, Number: %s\n", contact.getName(), contact.getPhoneNumber()));
    }


    private void addContact() {
        String name = getSearchInput("Give contact name: ");
        String phoneNumber = getSearchInput("Give contact phonenumber: ");
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


    private void modifyContact() {
        int contact = contactList.indexOf(getSearchInput("Give contact name: "));
        String newName = getSearchInput("Give new Contact name: ");
        String newNumber = getSearchInput("Give newContact phonenumber: ");
        if (contact >= 0) {
            contactList.get(contact).setName(newName);
            contactList.get(contact).setPhoneNumber(newNumber);
        }
    }

    private void deleteContact() {
        int contact = contactList.indexOf(getSearchInput("Give contact name: "));
        if (contact >= 0)
            contactList.remove(contact);
    }


    private String getSearchInput(String message) {
        System.out.print(message);
        return scanner.next();
    }
}

import java.util.Scanner;

public class Main {
//    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        MobilePhone newMobba = new MobilePhone();

        newMobba.printContacts();
        newMobba.addContact("Diego", "06-1231");
        newMobba.printContacts();
        newMobba.modifyContact("Diego", "Staphorst", "06-1231");
        newMobba.printContacts();
        newMobba.addContact("Diego1", "06-12311");
        newMobba.addContact("Diego2", "06-12312");
        newMobba.addContact("Diego3", "06-12313");
        newMobba.addContact("Diego4", "06-12314");
        newMobba.addContact("Diego5", "06-12315");
        newMobba.printContacts();
        newMobba.deleteContact("Staphorst1");
        newMobba.printContacts();
        newMobba.openContactsMenu();

    }
}

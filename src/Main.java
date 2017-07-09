import java.util.Scanner;

public class Main {
//    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        MobilePhone newMobba = new MobilePhone();
        newMobba.printContacts();
        newMobba.modifyContact("Diego", "Staphorst", "06-1231");
    }
}

package Autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by diego on 11/07/2017.
 */
public class Bank {
    private Scanner scanner;
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
        this.scanner = new Scanner(System.in);
    }

    public void openContactsMenu() {
        boolean opened = true;
        while (opened) {
            printOptions();
            switch (getMenuOption()) {
                case 1: // Create branch
                    System.out.println("Create new branch:");
                    createNewBranch();
                    break;
                case 2: // Add customer to branch
                    System.out.println("Add customer to branch");
                    break;
                case 3: // Add transaction to customer
                    System.out.println("Add transaction for customer in branch");
                    break;
                case 4: // Show customer transactions
                    System.out.println("Show all available branches");
                    break;
                case 5: // Show customer transactions
                    System.out.println("Show customer & his/her transactions in branch");
                    break;
                case 6: // Close contactlist
                    opened = false;
                    break;
            }
        }
    }

    private void createNewBranch() {
        this.branches.add(new Branch(getInput("Give the new branch name: ")));
    }

    private String getInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    private double getTransactionInput(){
        System.out.print("How much was the transaction: ");
        return scanner.nextDouble();
    }

    private void printOptions() {
        System.out.println();
        System.out.println(" ___________________________");
        System.out.println("|                           |");
        System.out.println("|   1 - Create branch       |");
        System.out.println("|   2 - Add customer        |");
        System.out.println("|   3 - Add transaction     |");
        System.out.println("|   4 - Show customer       |");
        System.out.println("|   5 - Close contactlist   |");
        System.out.println("|___________________________|");
        System.out.println();
    }

    private int getMenuOption() {
        System.out.print("Select your option [1-5]: ");
        return (scanner.nextInt());
    }
}

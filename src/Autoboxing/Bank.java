package Autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
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

    public void bankingOptions() {
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
                    addNewCustomerToBranch();
                    break;
                case 3: // Add transaction to customer
                    System.out.println("Add transaction for customer in branch");
                    addNewTransactionToCustomer();
                    break;
                case 4: // Show customer transactions
                    System.out.println("Show all available branches:\n");
                    printAvailableBranches();
                    break;
                case 5: // Show customer transactions
                    System.out.println("Show customer & his/her transactions in branch");
                    printCustomersInBranch();
                    break;
                case 6: // Close contactlist
                    opened = false;
                    break;
            }
        }
    }

    private void addNewTransactionToCustomer() {
        for (Customer customer :findBranch(getInput("Give the branch name: ")).getCustomerList()) {
            if (customer.getName().equals(getInput("Give the customer name: "))) {
                customer.addTransaction(getTransactionInput());
            }
        };
    }

    private void printCustomersInBranch() {
        for (Customer customer :findBranch(getInput("Give the branch name: ")).getCustomerList()) {
            System.out.printf("Customer %s made these transactions: %s\n", customer.getName(), Arrays.toString(customer.getTransactions().toArray()));
        };
    }

    private void printAvailableBranches() {
        branches.forEach((branch) -> System.out.printf("Branch: %s.\n", branch.getName()));
    }

    private void addNewCustomerToBranch() {
        createNewCustomer(findBranch(getInput("Give the branch name: ")));
    }

    private Branch findBranch(String branchName) {
        for (Branch branch: this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    private void createNewCustomer(Branch branch) {
        branch.addNewCustomer(getInput("Give the customer name: "), getTransactionInput());
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
        System.out.println("|   4 - Show branches       |");
        System.out.println("|   5 - Show Customer       |");
        System.out.println("|   6 - Close contactlist   |");
        System.out.println("|___________________________|");
        System.out.println();
    }

    private int getMenuOption() {
        System.out.print("Select your option [1-6]: ");
        return (scanner.nextInt());
    }
}

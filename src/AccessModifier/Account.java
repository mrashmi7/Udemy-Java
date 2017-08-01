package AccessModifier;

import java.util.ArrayList;

/**
 * Created by diego on 01/08/2017.
 */
public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            this.transactions.add(amount);
            this.balance += amount;
            System.out.printf("%d deposited. Balance is now %d\n", amount, this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }
    public void withdraw(int amount){
        int withdrawal = -amount;
        if (withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.printf("%d withdraw. Balance is now %d\n", withdrawal, this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.balance += 0;
        for (int i:this.transactions) {
            this.balance += 1;
        }
        System.out.printf("Calculated balance is %d\n", this.balance);
    }
}

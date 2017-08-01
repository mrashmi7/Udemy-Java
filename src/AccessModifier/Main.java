package AccessModifier;

/**
 * Created by diego on 01/08/2017.
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("Diego");
        account.deposit(1000);
        account.deposit(-500);
        account.withdraw(-200);
        account.withdraw(500);
        account.calculateBalance();

        System.out.printf("Balance on account is: %d\n", account.getBalance());
    }
}

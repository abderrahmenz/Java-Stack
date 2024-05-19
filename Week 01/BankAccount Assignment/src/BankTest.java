public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.deposit(100.0, "checking");
        account2.deposit(200.0, "savings");
        account3.deposit(50.0, "checking");

        account1.withdraw(30.0, "checking");
        account2.withdraw(250.0, "savings");

        account1.getBalance();
        account2.getBalance();
        account3.getBalance();

        BankAccount.printAccountsInfo();
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account(1001);
        SavingsAccounts a2 = new SavingsAccounts(1002, 0.05);
        CheckingAccount a3 = new CheckingAccount(1003);

        a1.deposit(500);
        a2.deposit(1000);
        a3.deposit(200);

        a3.withdraw(20);
        a3.deposit(50);
        a3.withdraw(10);
        a3.deposit(30);

        bank.openAccount(a1);
        bank.openAccount(a2);
        bank.openAccount(a3);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("After update:");
        bank.printAccounts();
    }
}
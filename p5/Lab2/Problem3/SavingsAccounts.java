public class SavingsAccounts extends Account {
    private double interestRate;

    public SavingsAccounts(int accNumber, double interestRate){
        super(accNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){return interestRate;}

    public void addInterestRate(){
        double newBalance = getBalance() * interestRate;
        deposit(newBalance);
    }
}

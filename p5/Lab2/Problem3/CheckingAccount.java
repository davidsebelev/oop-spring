public class CheckingAccount extends Account {
    private int numberOfTransactions;
    public static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int accNumber){
        super(accNumber);
        numberOfTransactions = 0;
    }
    
    @Override
    public void deposit(double sum){
        super.deposit(sum);
        numberOfTransactions++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        numberOfTransactions++;
    }

    public void deductFee(){
        if(numberOfTransactions > FREE_TRANSACTIONS){
            int extraTransactions = numberOfTransactions - FREE_TRANSACTIONS;
            double extra = extraTransactions * 0.02;
            super.withdraw(extra);
            numberOfTransactions = 0;
        }
    }


    
}

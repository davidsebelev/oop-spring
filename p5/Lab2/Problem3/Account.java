public class Account {
    private double balance; 
    private int accNumber; 

    public Account(int accNumber){
        balance = 0.0;
        this.accNumber = accNumber;
    }
    
    public double getBalance(){return balance;}
    public int getAccNumber(){return accNumber;}
    

    public void deposit(double sum){
        if(sum > 0) balance+=sum;
    }
    public void withdraw(double sum){
        if(sum <= balance && sum > 0) balance -= sum;
    }
    public void transfer(double amount, Account other){
        if(amount > 0 && amount <= balance){
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    public String toString(){
        return "Account number is "+getAccNumber()+" and balance is "+getBalance()+".";
    }

    public final void print(){
        System.out.println(toString());
    }
}

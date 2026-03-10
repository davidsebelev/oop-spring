import java.util.Vector;

public class Bank{
    private Vector<Account> accounts;

    public Bank(){
        accounts = new Vector<>();
    }

    public void openAccount(Account a){
        accounts.add(a);
    }

    public void closeAccount(int accNumber){
        for(int i = 0 ; i < accounts.size();i++){
            if(accounts.get(i).getAccNumber() == accNumber){
                accounts.remove(i);
                break;
            }
        }
    }

    public void update(){
        for(Account acc : accounts){
            if(acc instanceof SavingsAccounts){
                SavingsAccounts s = (SavingsAccounts) acc;
                s.addInterestRate();
            }else if(acc instanceof CheckingAccount){
                CheckingAccount ch = (CheckingAccount) acc;
                ch.deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
    }


    
}

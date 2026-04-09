package SL1.Q2;

public class Savings extends Account{
    protected static double balance;
    public Savings(int accountno, String name, double balance) {
        super(accountno, name);
        this.balance=balance;
    }

    @Override
    public void withdrawl(double amount) {
        if(balance-amount>10000){
            balance-=amount;
            System.out.println("Withdrawl Successful!! now balance is : "+balance);
        }
        else{
            System.out.println("Insufficent balance");
        }
    }

    @Override
    public void deposit(double amount) {
        if(amount<=100000){
            balance+=amount;
            System.out.println("amount deposited successfully!! now balance is :"+balance);
        }
        else{
            System.out.println("amount excceded max limit!!");
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

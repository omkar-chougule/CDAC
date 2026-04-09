package day10.Assignment;

public class Account {
    private int accountno;
    private String name;
    private double balance;

    public Account(int accountno, String name, double balance){
        this.accountno=accountno;
        this.name=name;
        this.balance = balance;
    }

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized  void withdrawl(double amt){
        System.out.println("Withdrawl Starting--");
        if(balance > amt){
            balance -= amt;
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amt;
        }

        System.out.println("Withdrawl Successfully " + "Now the balance is: " + balance);
    }
    public  synchronized void deposit(double amt){
        System.out.println("Depositing--");
        balance += amt;
        System.out.println("Deposited successfully. " + "Now the balance is: " + balance);
        notify();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountno=" + accountno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

package SL1.Q2;

public abstract class Account {
    protected int accountno;
    protected String name;

    public Account(int accountno, String name){
        this.accountno=accountno;
        this.name=name;

    }

    public abstract void withdrawl(double amt);
    public abstract void deposit(double amt);

    @Override
    public String toString() {
        return "Account{" +
                "accountno=" + accountno +
                ", name='" + name + '\'' +
                '}';
    }
}

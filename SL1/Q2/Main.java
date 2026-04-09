package SL1.Q2;

public class Main {
    static void main() {
        Current c = new Current(686986,"god",900000);
        Savings s = new Savings(9086986,"demigod",800000);
        c.withdrawl(20000);
        s.withdrawl(20000);
        c.deposit(5000);
        s.deposit(10000);
    }
}

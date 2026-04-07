package Day7.fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {
    private int pid;
    private String pname;
    private double balance; // removed transient so salary is serialized

    public Account(int pid, String pname, double salary) {
        this.pid = pid;
        this.pname = pname;
        this.balance = salary;
    }

    @Override
    public String toString() {
        return "Account{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", salary=" + balance +
                '}';
    }

    public double getSalary() {
        return balance;
    }

    public static void main(String [] args){
        File f = new File("Account.txt");
        File balanceFile = new File("Balance.txt");


        List<Account> accList = new ArrayList<>();
        accList.add(new Account(1, "Alice", 5000));
        accList.add(new Account(2, "Bob", 7000));
        accList.add(new Account(3, "Charlie", 9000));


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))){
            for(Account acc : accList){
                out.writeObject(acc);
            }
        } catch (IOException e) {
            System.out.println(e);
        }


        try(ObjectInputStream in  = new ObjectInputStream(new FileInputStream(f));
            BufferedWriter bw = new BufferedWriter(new FileWriter(balanceFile))) {

            while(true){
                try{
                    Account account = (Account) in.readObject();
                    System.out.println(account); // print full account
                    bw.write("Balance for " + account.pname + ": " + account.getSalary());
                    bw.newLine();
                }
                catch (EOFException e){
                    break;
                }
            }
        }
        catch (ClassNotFoundException | IOException e){
            System.out.println(e);
        }

        // Read and display Balance.txt
        try (BufferedReader br = new BufferedReader(new FileReader(balanceFile))) {
            String line;
            System.out.println("Contents of Balance.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading Balance.txt: " + e.getMessage());
        }
    }
}

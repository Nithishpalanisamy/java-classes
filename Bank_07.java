import java.util.*;

class Account 
{ 
 private double bal; //The current balance 
 private int accnum; //The account number 
  
  
 public Account(int a) 
 {  
bal=0.0; 
accnum=a; 
 } 
  
 public void deposit(double sum) 
 { 
if (sum>0) 
 bal+=sum;  
else 
 System.err.println("Account.deposit(...): " 
 +"cannot deposit negative amount.");  
 } 
  
 public void withdraw(double sum) 
 {
if (sum>0) 
 bal-=sum;  
else 
 System.err.println("Account.withdraw(...): " 
 +"cannot withdraw negative amount.");  
 } 
  
 public double getBalance() 
 { 
return bal; 
 } 
  
 public double getAccountNumber() 
 { 
return accnum; 
 } 
  
 public String toString() 
 { 
return "Acc " + accnum + ": " + "balance = " + bal;  
 } 
  
 public final void print() 
 { 
//Don't override this, 
//override the toString method 
System.out.println( toString() );  
 } 
  
} 
// SavingsAccount.java
class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a, double interestRate) {
        super(a);
        this.interest = interestRate;
    }

    public void addInterest() {
        deposit(getBalance() * interest);
    }

    @Override
    public String toString() {
        return super.toString() + ", interest rate = " + interest;
    }
}

// CurrentAccount.java
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int a, double overdraft) {
        super(a);
        this.overdraftLimit = overdraft;
    }

    @Override
    public void withdraw(double sum) {
        if (getBalance() - sum < overdraftLimit)
            System.err.println("CurrentAccount.withdraw(...): " + "cannot withdraw beyond the overdraft limit.");
        else
            super.withdraw(sum);
    }

    @Override
    public String toString() {
        return super.toString() + ", overdraft limit = " + overdraftLimit;
    }
}

// Bank.java


class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount)
                ((SavingsAccount) acc).addInterest();
            else if (acc instanceof CurrentAccount && acc.getBalance() < 0)
                System.out.println("CurrentAccount.update(...): " + "sending overdraft letter to " + acc.getAccountNumber());
        }
    }

    public void payDividend(double dividend) {
        for (Account acc : accounts)
            acc.deposit(dividend);
    }
}

// Bank_07.java
public class Bank_07 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account(1);
        acc1.deposit(1000);
        bank.openAccount(acc1);

        SavingsAccount acc2 = new SavingsAccount(2, 0.05);
        acc2.deposit(2000);
        bank.openAccount(acc2);

        CurrentAccount acc3 = new CurrentAccount(3, -500);
        acc3.deposit(3000);
        bank.openAccount(acc3);

        bank.update();
        bank.payDividend(100);

        acc1.print();
        acc2.print();
        acc3.print();
    }
}

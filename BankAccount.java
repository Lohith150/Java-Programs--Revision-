
class Account {

    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {

        Account b = new Account();

        b.setAccountHolder("Lohith");
        b.setBalance(5000);

        b.setBalance(-1000);
        b.withdraw(6000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}

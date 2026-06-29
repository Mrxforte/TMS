package lesson7;
public class Task3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500.0);

        boolean success1 = account.withdraw(200.0);
        System.out.println("Withdraw 200: " + success1);

        boolean success2 = account.withdraw(400.0);
        System.out.println("Withdraw 400: " + success2);

        System.out.println("Current Balance: " + account.getBalance());
    }
}

class BankAccount {
    private double balance = 0.0;

    public void deposit(double amount) {
        balance += amount;
        logTransaction("Deposit", amount);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            logTransaction("Withdrawal", amount);
            return true;
        }
        return false;
    }

    private void logTransaction(String type, double amount) {
        System.out.println("Transaction: " + type + " | Amount: " + amount);
    }

    public double getBalance() {
        return this.balance;
    }
}


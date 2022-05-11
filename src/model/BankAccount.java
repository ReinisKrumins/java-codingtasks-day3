package model;

public class BankAccount {
    //Variables
    private double balance;
    private long accountId;
    private static int MAX_DEPOSIT_AMOUNT = 5000;
    private static int counter = 1000;

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = (balance != 0) ? balance : 0;
    }
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId() {
        this.accountId = counter++;
    }
    public BankAccount()
    {
        setBalance(balance);
        setAccountId();
    }
    public BankAccount(double balance)
    {
        setBalance(balance);
        setAccountId();
    }


    public double deposit(double amount)
    {
        if(amount > MAX_DEPOSIT_AMOUNT){
            System.out.println("Transaction cancelled. " +
                    "Max deposit: 5000 | " +
                    "Your deposit:" + amount);
        }
        else {
            double newAmount = balance + amount;
            balance = newAmount;
        }

        return balance;
    }
    public double withdraw(double amount)
    {
        if(amount > balance) {
            System.out.println("Account with ID:" + getAccountId() + " has insufficient balance");
        }
        else {
            double newAmount = balance - amount;
            balance = newAmount;
        }

        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "ID:" + getAccountId() + " balance=" + balance + '}';
    }
}

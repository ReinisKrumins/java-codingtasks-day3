package service;

import model.BankAccount;

import java.util.ArrayList;

public class MainBankService {

    private static ArrayList<BankAccount> allAccounts = new ArrayList<>();
    public static void main(String[] args) {

        BankAccount bankAcc = new BankAccount();
        BankAccount bankAcc2 = new BankAccount();
        BankAccount bankAcc3 = new BankAccount();
        BankAccount bankAcc4 = new BankAccount();
        allAccounts.add(bankAcc);
        allAccounts.add(bankAcc2);
        allAccounts.add(bankAcc3);
        allAccounts.add(bankAcc4);

        System.out.println("*All bank accounts*");
        for(BankAccount tempBA: allAccounts)
        {
            if(tempBA instanceof BankAccount)
                System.out.println(tempBA.toString());
        }

        System.out.println("*Deposit*");
        bankAcc.deposit(6000);
        bankAcc2.deposit(50);
        bankAcc3.deposit(23);
        bankAcc4.deposit(36);

        System.out.println("*Withdrawl*");
        bankAcc2.withdraw(77);
        bankAcc3.withdraw(3);

        System.out.println("*Transfer*");
        transferMoney(bankAcc4, bankAcc, 38);
        transferMoney(bankAcc4, bankAcc, 18);

        System.out.println("*All bank accounts*");
        for(BankAccount tempBA: allAccounts)
        {
            if(tempBA instanceof BankAccount)
                System.out.println(tempBA.toString());
        }
    }
    public static void transferMoney(BankAccount b1, BankAccount b2, double amount){
        int temp = (int) b1.getBalance();
        b1.withdraw(amount);
        if(b1.getBalance() == temp){
            System.out.println("*ERROR* \nCould not transfer funds do to insufficient balance");
        }else{
            b2.deposit(amount);
            System.out.println("Transfer successful!" + "Transfered: " + amount);
        }
    }
}
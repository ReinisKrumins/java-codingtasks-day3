package service;

import model.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAcc = new BankAccount();
        BankAccount bankAcc2 = new BankAccount();

        bankAcc.deposit(223230);
        bankAcc2.deposit(5);

        System.out.println(bankAcc.toString());
        System.out.println(bankAcc2.toString());

        transferMoney(bankAcc, bankAcc2, 25);

        System.out.println(bankAcc.toString());
        System.out.println(bankAcc2.toString());

    }
    public static void transferMoney(BankAccount b1, BankAccount b2, double amount){
        int temp = (int) b1.getBalance();;
        b1.withdraw(amount);
        if(b1.getBalance() == temp){
            System.out.println("*ERROR* \nCould not transfer funds do to insufficient balance");
        }else{
            b2.deposit(amount);
        }
    }
}
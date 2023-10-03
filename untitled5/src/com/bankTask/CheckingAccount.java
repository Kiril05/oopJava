package com.bankTask;

public class CheckingAccount extends Account{
    public CheckingAccount(String name, int balance) {
        super(name, balance);
    }
    public void withdraw(int amount) {
        if(this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Fail to withdraw, balance is " + this.getBalance());
        }
    }
    public void __str__() {
        System.out.println("CheckingAccount(name=" + this.getName() + ", balance=" + this.getBalance());
    }
}

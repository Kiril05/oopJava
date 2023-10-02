package com.check;

public class CheckingAccount {
    private String name;
    private int balance;
    CheckingAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        if (this.getBalance() - amount > 0) {
            this.setBalance(getBalance() - amount);
        } else {
            System.out.println("Fail to withdraw, balance is " + this.getBalance());
        }
    }
    public String __str__() {
        return "CheckingAccount(name=" + this.getName() + ", balance=" + this.getBalance();
    }
}

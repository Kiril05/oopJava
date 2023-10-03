package com.bankTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    private final ArrayList<CreditAccount> accounts = new ArrayList<CreditAccount>();

    public ArrayList<CreditAccount> getAccounts() {
        return accounts;
    }

    public void display_accounts() {
        for(int i = 0; i < this.accounts.size(); i++) {
            System.out.println("Name: " + this.accounts.get(i).getName() + ", balance: " + this.accounts.get(i).getBalance() + ", interest_rate: " + this.accounts.get(i).getInterest_rate() + ", credit_limit: " + this.accounts.get(i).getCredit_limit());
        }
    }
    public void openCreditAccount(String name, int balance, float interest_rate, int credit_limit) {
        this.accounts.add(new CreditAccount(name, balance, interest_rate, credit_limit));
    }
    public int total_cash() {
        int cash = 0;
        for(int i = 0; i < this.accounts.size(); i++) {
            if(this.accounts.get(i).getBalance() > 0) {
                cash += this.accounts.get(i).getBalance();
            }
        }
        return cash;
    }
    public int total_credit() {
        int credit = 0;
        for (CreditAccount account : this.accounts) {
            if (account.getBalance() < 0) {
                credit += account.getBalance();
            }
        }
        return credit;
    }
    public void apply_daily_interest() {
        for(CreditAccount account : this.accounts) {
            account.apply_daily_interest();
        }
    }

}

package com.bankTask;

public class CreditAccount extends Account {
    private float interest_rate;
    private int credit_limit;

    public CreditAccount(String name, int balance, float interest_rate, int credit_limit) {
        super(name, balance);
        this.interest_rate = interest_rate;
        this.credit_limit = credit_limit;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(int credit_limit) {
        this.credit_limit = credit_limit;
    }

    public void withdraw(int amount) {
        if (this.getBalance() - amount > 0 - credit_limit){
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("You crossed credit limit");
        }
    }
    public void apply_daily_interest() {
        if(this.getBalance() < 0) {
            this.setBalance((int) (this.getBalance() + this.getBalance() / 100 * this.interest_rate));
        }
    }
}

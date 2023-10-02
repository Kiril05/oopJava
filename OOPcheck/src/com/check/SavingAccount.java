package com.check;

public class SavingAccount extends CheckingAccount{

    private float interest_rate;
    SavingAccount(String name, int balance, float interest_rate) {
        super(name, balance);
        this.interest_rate = interest_rate;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }


    public void withdraw() {
        System.out.println("No ability to withdraw by SavingAccount");
    }

    @Override
    public String __str__() {
        return "CheckingAccount(name=" + this.getName() + ", interest_rate=" + this.interest_rate + ", balance=" + this.getBalance();
    }
    public void apply_daily_interest() {
        if (this.interest_rate > 0) {
            this.setBalance((int) (this.getBalance() + this.getBalance() / 100 * this.interest_rate));
        }
    }
}

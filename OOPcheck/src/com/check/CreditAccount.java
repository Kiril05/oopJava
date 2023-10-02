package com.check;

public class CreditAccount extends SavingAccount {

    private int credit_limit;
    CreditAccount(String name, int balance, float interest_rate, int credit_limit) {
        super(name, balance, interest_rate);
        this.credit_limit = credit_limit;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(int credit_limit) {
        this.credit_limit = credit_limit;
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() - amount > 0 - credit_limit){
            super.withdraw(amount);
        } else {
            System.out.println("You crossed credit limit");
        }
    }
    @Override
    public void apply_daily_interest() {
        if(this.getBalance() < 0) {
            this.setBalance((int) (this.getBalance() - this.getBalance() / 100 * this.getInterest_rate()));
        }
    }
}

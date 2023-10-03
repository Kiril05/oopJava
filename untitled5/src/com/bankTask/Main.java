package com.bankTask;

public class Main {

    public static void main(String[] args) {
        CreditAccount dude = new CreditAccount("Credit Dude", 1000, 30, 200);
        Bank bank = new Bank();
        bank.openCreditAccount("Tom", 1500, 25.5f, 3000);
        bank.openCreditAccount("Jerry", 2000, 6, 6500);
        bank.display_accounts();
        System.out.println(bank.total_cash());
        for (int i = 0; i < bank.getAccounts().size(); i++) {
            bank.getAccounts().get(i).withdraw(3000);
        }
        bank.display_accounts();
        System.out.println(bank.total_credit());
        bank.apply_daily_interest();
        bank.display_accounts();


    }

}

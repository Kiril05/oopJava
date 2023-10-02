package com.check;

public class Main {


    public static void main(String[] args) {
        CreditAccount tom = Bank.openCreditAccount("Tom",  500, 5, 100);
        Bank.display_accounts();
    }

}

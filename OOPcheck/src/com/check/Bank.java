package com.check;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private static ArrayList<float[]> accounts;
    private static int total_cash;
    private static int total_credit;
    public static CreditAccount openCreditAccount(String name, int balance, float interest_rate, int credit_limit) {
        total_cash += balance;
        total_credit += balance;
        return new CreditAccount(name, balance, interest_rate, credit_limit);
    }
    public static void display_accounts() {
        for(float[] el : accounts) {
            System.out.println(Arrays.toString(el));
        }
    }

    public void apply_daily_interest(float number) {

    }

}

class CheckingAccount {
    constructor(name, balance) {
        this.name = name;
        this.balance = balance;
    }
    deposit(amount) {
        this.balance += amount;
    }
    withdraw(amount) {
        if(this.balance - amount >= 0) {
            this.balance -= amount;
        }
    }
    __str__() {
        return `CheckingAccount(name=${this.name},balance=${this.balance})`;
    }
}

class SavingAccount extends CheckingAccount {
    constructor(name, balance, interest_rate) {
        super(name, balance);
        this.interest_rate = interest_rate;
    }
    withdraw() {
        console.log("Can't withdraw from SavingAccount");
    }
    __str__() {
        return `CheckingAccount(name=${this.name},interest_rate${this.interest_rate},balance=${this.balance})`;
    }
    apply_daily_interest() {
        if(this.interest_rate > 0) {
            this.balance + this.balance / 100 * this.interest_rate;
        }
    }
}

class CreditAccount extends SavingAccount {
    constructor(name, balance, interest_rate) {
        super(name, balance, interest_rate);
        this.credit_limit = this.credit_limit;
    }
    withdraw(amount) {
        if(this.balance - amount >= 0 - this.credit_limit) {
            this.balance -= amount;
        }
    }

    apply_daily_interest() {
        if(this.balance < 0) {
            this.balance - this.balance / 100 * this.interest_rate;
        }
    }
}

class Bank {
    constructor() {
        this.accounts = [];
    }
    openCreditAccount(name, balance, interest_rate, credit_limit) {
        this.accounts.push(new CreditAccount(name, balance, interest_rate, credit_limit));
    }
    display_accounts() {
        for(let account in this.accounts) {
            console.log(account);
        }
    }
}

Bank.openCreditAccount(tom, "Tom", 500, 5, 30);
Bank.display_accounts();



function CheckingAccount(name, balance) {
    this.name = name;
    this.balance = balance;
}

CheckingAccount.prototype.deposit = function(amount) {
    this.balance += amount;
}
CheckingAccount.prototype.withdraw = function(amount) {
    if(this.balance - amount >= 0) {
        this.balance -= amount;
    }
}
CheckingAccount.prototype.__str__ = function() {
    return `CheckingAccount(name=${this.name},balance=${this.balance})`;
}

let checkDude = new CheckingAccount("Check Dude", 600);
console.log(checkDude);


function SavingAccount(name, balance, interest_rate) {
    CheckingAccount.call(this, name, balance);
    this.interest_rate = interest_rate;
}

SavingAccount.prototype.__proto__ = CheckingAccount.prototype;
SavingAccount.prototype.apply_daily_interest = function() {
    if(this.interest_rate > 0) {
        this.balance += this.balance / 100 * this.interest_rate;
    }
}
SavingAccount.prototype.withdraw = function(amount) {
        console.log("Can't withdraw");
}

let saveDude = new SavingAccount("Save Dude", 500, 30);
console.log(saveDude);

function CreditAccount(name, balance, interest_rate, credit_limit) {
    SavingAccount.call(this, name, balance, interest_rate);
    this.credit_limit = credit_limit;
}
CreditAccount.prototype.__proto__ = SavingAccount.prototype;
CreditAccount.prototype.withdraw = function(amount) {
    if(this.balance - amount >= 0 - this.credit_limit) {
        this.balance -= amount;
    } else {
        console.log("You cross credit limit");
    }
}
CreditAccount.prototype.apply_daily_interest = function() {
    if(this.balance < 0) {
        this.balance - this.balance / 100 * this.interest_rate;
    }
}
let creditDude = new CreditAccount("Credit Dude", 1000, 20, 200);
console.log(creditDude);

function Bank() {
    this.accounts = [];
}
Bank.prototype.openAccount = function(name, balance, interest_rate, credit_limit) {
    let x = new CreditAccount(name, balance, interest_rate, credit_limit);
    this.accounts.push(x);
} 
Bank.prototype.total_cash = function() {
    let cash = 0;
    for(let account in this.accounts) {
        if (this.accounts[account]["balance"] > 0) {
            cash += this.accounts[account]["balance"];
        }
    }
    return cash;
}
Bank.prototype.total_credit = function() {
    let credit = 0;
    for (let i = 0; i < this.accounts.length; i++) {
        if (this.accounts[i]["balance"] < 0) {
            credit += this.accounts[i]["balance"];
        }
    }
    return credit;
}

Bank.prototype.apply_daily_interest = function(interest) {
    for(let i = 0; i < this.accounts.length; i++) {
        this.accounts[i]["interest_rate"] = interest;
    }
}
Bank.prototype.display_accounts = function() {
    for(let i = 0; i < this.accounts.length; i++) {
        console.log(this.accounts[i]);
    }
}

let bank = new Bank;
bank.openAccount("Tom", 500, 5, 1000);
bank.openAccount("Jerry", 1000, 6, 3000);
bank.openAccount("Cat", 1400, 300, 5000);
console.log(bank.accounts);
console.log(bank.total_cash());
bank.apply_daily_interest(10);
console.log(bank.accounts);

for(let i = 0; i < bank.accounts.length; i++) {
    bank.accounts[i].withdraw(1300);
}
bank.display_accounts();
console.log(bank.total_credit());



public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    // Default state = Active
    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public void setState(AccountState state) {
        this.accountState = state;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(Double amount) {
        accountState.deposit(this, amount);
    }

    public void withdraw(Double amount) {
        accountState.withdraw(this, amount);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void close() {
        accountState.close(this);
    }

    public String toString() {
        return "Account Number: " + accountNumber + 
               ", Balance: " + balance;
    }
}

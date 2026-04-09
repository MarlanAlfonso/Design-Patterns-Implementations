
public class AccountTest {
    public static void main(String[] args) {

        Account myAccount = new Account("1234", 10000.0); 
        // set account to active state

        myAccount.activate(); 
        // displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); 
        // displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); 
        // displays "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0);  
        // update balance and display account number and current balance

        // Withdraw from the account
        myAccount.withdraw(100.0);  
        // update balance and display account number and current balance

        // Close the account
        myAccount.close();  
        // displays "Account is closed!"

        // Activate the account
        myAccount.activate();  
        // displays "You cannot activate a closed account!"

        // Suspend the account
        myAccount.suspend();  
        // displays "You cannot suspend a closed account!"

        // Withdraw from the account
        myAccount.withdraw(500.0);  
        // displays message + current account info

        // Deposit to the account
        myAccount.deposit(1000.0);  
        // displays message + current account info
    }
}

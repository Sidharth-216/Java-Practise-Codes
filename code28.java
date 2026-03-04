/* 
Write a Java program to create a class called Account with instance variables 
accountNumber and balance. 
Implement a parameterized constructor that initializes these variables with validation.
a) accountNumber should be non-null and non-empty.
b) balance should be non-negative.
c) Print an error message if the validation fails.
*/

class Account {
    String accountNumber;
    double balance;

    
    public Account(String accountNumber, double balance) {
 
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = "Invalid";
        } else {
            this.accountNumber = accountNumber;
        }

        // Validation for balance
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            this.balance = 0.0; 
        } else {
            this.balance = balance;
        }
    }

   
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Account a1 = new Account("A1001", 5000);
        a1.display();

  
        Account a2 = new Account("", 2500);
        a2.display();

        
        Account a3 = new Account("A1003", -1000);
        a3.display();

      
        Account a4 = new Account("", -500);
        a4.display();
    }
}


import java.util.Random;

public class Bank {
    long accNumber;
    String accHolder;
    int accBalance;

    static long generateRandomAccount(int length){
        long min = (long) Math.pow(10, length - 1); // Minimum possible value
        long max = (long) Math.pow(10, length) - 1; // Maximum possible value
        Random random = new Random();
        return min + random.nextInt((int) (max - min + 1));
    }

    Bank(long no, String name, int amount){
        this.accNumber = generateRandomAccount(10);
        this.accHolder = name;
        this.accBalance = amount;
    }

    String getAccountHolder(){
        return this.accHolder;
    }
    long getAccountNumber(){
        return this.accNumber;
    }
    int getBalance(){
        return this.accBalance;
    }

    

}

// BankAccount.java

// Create a BankAccount class with the following attributes and methods:
// Attributes:
// - accountNumber (int): represents the account number
// - accountHolder (String): represents the account holder's name
// - balance (double): represents the account balance

// Methods:
// - A default constructor that initializes the account number to 0, account holder to an empty string, and balance to 0.0.
// - A parameterized constructor that takes the account number, account holder, and initial balance as arguments and initializes the attributes accordingly.
// - A copy constructor that takes another BankAccount object as an argument and initializes the attributes based on its values.
// - getAccountNumber(): returns the account number.
// - getAccountHolder(): returns the account holder's name.
// - getBalance(): returns the account balance.
// - deposit(double amount): takes an amount to deposit and updates the account balance accordingly.
// - withdraw(double amount): takes an amount to withdraw and updates the account balance accordingly. Ensure that the account balance doesn't go below 0.

// In the main method of another class (e.g., MainApp), create instances of BankAccount using different constructors and test the methods.
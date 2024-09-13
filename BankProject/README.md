# Bank Project

## Overview
This Java-based **Bank Project** provides a simple simulation of a banking system where users can create accounts, store account details, retrieve account information, and perform operations like adding or removing accounts.

The project demonstrates the use of basic object-oriented principles such as encapsulation, as well as Java Collections (`HashMap`) for storing account details.

## Project Structure
- **Account.java**: Defines the structure of a bank account, including properties like `accountId`, `name`, and `balance`.
- **Bank.java**: Manages all the accounts using a `HashMap` to store and retrieve `Account` objects.
- **UseBank.java**: Demonstrates the functionality of the `Bank` class by creating and managing multiple accounts.
- **demoGUI.java**: (Optional) Could be used to extend the functionality of the project by adding a graphical user interface (GUI).

## Classes

### 1. `Account.java`
This class represents an individual account in the bank with the following fields:
- `accountId`: A unique ID for each account.
- `name`: The account holder's name.
- `balance`: The current balance of the account.

Key methods:
- Getters and Setters for `accountId`, `name`, and `balance`.
- `toString()`: Provides a string representation of the account details.

### 2. `Bank.java`
This class manages the operations of the bank:
- `HashMap<Integer, Account> accounts`: A collection of all accounts stored using their `accountId` as the key.
- Methods include:
  - `addAccount(Account obj)`: Adds a new account to the bank.
  - `getAccount(Integer id)`: Retrieves account details for a given `accountId`.
  - `removeAccount(Integer id)`: Removes an account based on `accountId`.
  - `getAccountCount()`: Returns the total number of accounts.
  - `getAccounts()`: Returns all accounts in the bank.

### 3. `UseBank.java`
The `UseBank` class contains the `main` method and demonstrates the use of the `Bank` class:
- Creates multiple accounts.
- Adds accounts to the bank.
- Retrieves and prints account details.
- Removes an account and displays the remaining accounts.

## How to Run
1. Compile all `.java` files:
   ```bash
   javac BankProject/*.java
   ```

2. Run the `UseBank` class:
   ```bash
   java BankProject.UseBank
   ```

3. You will see the following operations:
   - Accounts being added to the bank.
   - Total number of accounts displayed.
   - Retrieve specific account details.
   - Remove an account and check the updated list.

## Sample Output
```
Account Id 1001 Added:true
Account Id 1001 Added:true
Account Id 1001 Added:true
Account Id 1001 Added:true
Account Id 1001 Added:true
The account you were looking for: Account{accountId=1004, name='Arti', balance=150000.0}
The account you were looking for: 1006: null
Total no of Accounts is: 4
All Accounts in bank b1 is: {1001=Account{accountId=1001, name='Anil', balance=90000.0}, 1002=Account{accountId=1002, name='Yograj', balance=100000.0}, 1003=Account{accountId=1003, name='Sushma', balance=100000.0}, 1004=Account{accountId=1004, name='Arti', balance=150000.0}}
Account Removed Status: true
Now after removing Account the total no of Accounts is: 3
Now remaining Account Details are:
1001=Account{accountId=1001, name='Anil', balance=90000.0}
1002=Account{accountId=1002, name='Yograj', balance=100000.0}
1003=Account{accountId=1003, name='Sushma', balance=100000.0}
```

## Future Enhancements
- Add features like transaction history, deposit/withdraw functions, and account authentication.

## License
This project is licensed under the [MIT License](LICENSE).

---

**Author**: Yograj Tripathi

This `README.md` provides an overview of your **Bank Project**, explains how it works, and gives users instructions on how to run and extend the project. It also includes a sample output for reference.

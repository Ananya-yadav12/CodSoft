package com.java;

import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount userAccount) {
        account = userAccount;
    }

    public void displayMenu() {
        System.out.println("\nOptions:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void start() {
        System.out.println("Welcome to the ATM");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice above below options : ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                deposit();
            } else if (choice.equals("2")) {
                withdraw();
            } else if (choice.equals("3")) {
                checkBalance();
            } else if (choice.equals("4")) {
                System.out.println("Thank you....for using the ATM. Goodbye!!");
                break;
            } else {
                System.out.println("Invalid choice. Sorry please try again.");
            }
        }
        scanner.close();
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (account.deposit(amount)) {
            System.out.printf("Deposit of $%.2f successful.%n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (account.withdraw(amount)) {
            System.out.printf("Withdrawal of $%.2f successful.%n", amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void checkBalance() {
        double balance = account.checkBalance();
        System.out.printf("Your balance is $%.2f%n", balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);
        atm.start();

        scanner.close();
    }
}

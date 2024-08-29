package org.example;

public class TataBank implements Bank{

    @Override
    public void deposit(int accNumber, double amount) {
        System.out.println("Depositing " + amount + " to account " + accNumber);
    }

    @Override
    public void withdraw(int accNumber, double amount) {
        System.out.println("Withdrawing " + amount + " to account " + accNumber);
    }
}

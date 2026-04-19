package classwork_4;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(owner + " пополнил счет на " + amount);
        } else {
            System.out.println("Сумма пополнения должна быть больше нуля");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма снятия должна быть больше нуля");
        } else if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств на счету у " + owner);
        } else {
            balance = balance - amount;
            System.out.println(owner + " снял со счета " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}
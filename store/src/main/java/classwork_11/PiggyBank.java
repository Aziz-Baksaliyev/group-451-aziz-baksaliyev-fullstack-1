package classwork_11;

public class PiggyBank {
    private double balance = 0.0;

    private boolean isBroken = false;

    public void addMoney(double amount) {
        if (!isBroken) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Добавлено: " + amount);
            }
        } else {
            System.out.println("Ошибка: Копилка разбита, в неё нельзя класть деньги!");
        }
    }

    public double breakOpen() {
        if (!isBroken) {
            isBroken = true;
            double total = balance;
            balance = 0;
            System.out.println("Копилка разбита! Вы достали все деньги.");
            return total;
        } else {
            System.out.println("Копилка уже была разбита ранее.");
            return 0;
        }
    }

    public double getBalance() {
        if (!isBroken) {
            return balance;
        } else {
            System.out.println("Копилка разбита, баланс недоступен.");
            return 0;
        }
    }
}

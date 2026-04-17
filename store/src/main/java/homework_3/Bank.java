package homework_3;

public class Bank {
    private static Bank instance;
    private int balance = 0;

    private Bank() {}

    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank myBank = Bank.getInstance();
        myBank.deposit(500);

        Bank anotherReference = Bank.getInstance();
        anotherReference.deposit(200);

        System.out.println("Баланс: " + myBank.getBalance());
        System.out.println(myBank == anotherReference);
    }
}

package classwork_4;

public class MainForBank {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("Aзиз", 1000.0);

        myAcc.deposit(500.0);
        System.out.println("Текущий баланс: " + myAcc.getBalance());

        myAcc.withdraw(300.0);
        System.out.println("Баланс после снятия: " + myAcc.getBalance());

        myAcc.withdraw(5000.0);

        System.out.println("Итоговый баланс: " + myAcc.getBalance());
    }
}
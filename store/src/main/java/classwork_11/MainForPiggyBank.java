package classwork_11;

public class MainForPiggyBank {
    public static void main(String[] args) {
        PiggyBank myBank = new PiggyBank();

        myBank.addMoney(150.50);
        myBank.addMoney(100.0);

        System.out.println("В копилке сейчас: " + myBank.getBalance());

        double cash = myBank.breakOpen();
        System.out.println("На руках: " + cash);

        myBank.addMoney(50);
    }
}

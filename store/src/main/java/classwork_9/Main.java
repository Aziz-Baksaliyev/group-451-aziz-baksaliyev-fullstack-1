package classwork_9;

public class Main {
    public static void main(String[] args) {
//        String password = "Qwerty1234";
//        if (password.length() < 8 && password.contains("1") && password.contains("Q")) {
//            System.out.println("Пароль надежный.");
//        }
//        else {
//            System.out.println("Пароль ненадежный.");
//        }

//        int num = 7;
//        int num2 = 6;
//        int num3 = 5;
//        int num4 = 4;
//        for (int i = 0; i < num; i++) {
//
//        }
//        int balance = 999;
//        int popolnenieScheta = -2;
//        int snyatDengee = 1000;
////      1 --- проверка баланса
//        System.out.println("Баланс: " + balance);
////      2 --- пополнить счет
//        if (popolnenieScheta < 1) {
//            System.out.println("Пополнение: Нельзя вводить 0 или отрицательные суммы.");
//        }
////      3 --- снять деньги
//        if (snyatDengee > balance) {
//            System.out.println("Снятие денег: Нельзя снять больше, чем есть.");
//        }
        int n = 15;
        for (int i = 0; i <= 15; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

package classwork_4;

public class MathUtils {

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: число должно быть положительным");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 и 1 не простые числа
        if (n == 2) return true;  // 2 — единственное четное простое число

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numFactorial = 5;
        System.out.println("Факториал " + numFactorial + " = " + factorial(numFactorial));

        int numPrime = 17;
        if (isPrime(numPrime)) {
            System.out.println(numPrime + " — простое число");
        } else {
            System.out.println(numPrime + " — не простое число");
        }
    }
}
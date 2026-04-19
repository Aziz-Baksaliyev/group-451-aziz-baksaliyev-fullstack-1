package classwork_4;

public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
            int count = 0;
            System.out.print("Первые " + n + " чисел Фибоначчи: ");
            while (count < n) {
                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;

                count++;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            printFibonacci(8);
        }
    }
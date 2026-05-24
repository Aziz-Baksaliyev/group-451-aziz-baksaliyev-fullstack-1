package classwork_13;

public class Main {
    public static void main(String[] args) {
//        String name = "Aziz";
//        System.out.println(name);

//        int yr = 2026;
//        int age = 13;
//        System.out.println(yr - age);

//        double height = 10;
//        double width = 5;
//        System.out.println(height * width);

//        int a = 5;
//        int b = 10;
//        a = 10;
//        b = 5;

//        int totalMinutes = 150;
//
//        int hours = totalMinutes / 60;
//        int minutes = totalMinutes % 60;
//
//        System.out.printf("ч мин", hours, minutes);

//        double price = 1000.0;
//        double discountPercent = 20.0;
//
//        double finalPrice = price - (price * discountPercent / 100);
//
//        System.out.println("Итоговая цена: " + finalPrice);

//        double radius = 5.0;
//
//        double perimeter = 2 * Math.PI * radius;
//        double area = Math.PI * radius * radius;
//
//        System.out.println("Периметр: " + perimeter);
//        System.out.println("Площадь: " + area);

//        String firstName = "John";
//        String lastName = "Doe";
//
//        String fullName = firstName + " " + lastName;
//
//        System.out.println(fullName);

//        double celsius = 25.0;
//
//        double fahrenheit = celsius * 9 / 5 + 32;
//
//        System.out.println(fahrenheit + "°F");

//        System.out.println("Byte MAX: " + Byte.MAX_VALUE);
//        System.out.println("Short MAX: " + Short.MAX_VALUE);
//        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
//        System.out.println("Long MAX: " + Long.MAX_VALUE);

//        int number = 8;
//
//        if (number % 2 == 0) {
//            System.out.println("Чётное");
//        } else {
//            System.out.println("Нечётное");
//        }

//        int a = 10;
//        int b = 10;
//
//        if (a > b) {
//            System.out.println(a + " больше");
//        } else if (b > a) {
//            System.out.println(b + " больше");
//        } else {
//            System.out.println("Числа равны");
//        }

//        int num = -5;
//
//        if (num > 0) {
//            System.out.println("Положительное");
//        } else if (num < 0) {
//            System.out.println("Отрицательное");
//        } else {
//            System.out.println("Ноль");
//        }

//        int score = 78;
//
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 75) {
//            System.out.println("B");
//        } else if (score >= 60) {
//            System.out.println("C");
//        } else {
//            System.out.println("F");
//        }

//        int hour = 19;
//
//        if (hour >= 6 && hour <= 11) {
//            System.out.println("Утро");
//        } else if (hour >= 12 && hour <= 17) {
//            System.out.println("День");
//        } else if (hour >= 18 && hour <= 22) {
//            System.out.println("Вечер");
//        } else {
//            System.out.println("Ночь");
//        }

//        int year = 2026;
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("Високосный");
//        } else {
//            System.out.println("Не високосный");
//        }

//        int x = 7, y = 15, z = 3;
//        int max = x;
//
//        if (y > max) max = y;
//        if (z > max) max = z;
//
//        System.out.println("Максимум: " + max);

//        double n1 = 12;
//        double n2 = 4;
//        char op = '*';
//
//        switch (op) {
//            case '+' -> System.out.println(n1 + n2);
//            case '-' -> System.out.println(n1 - n2);
//            case '*' -> System.out.println(n1 * n2);
//            case '/' -> System.out.println(n2 != 0 ? n1 / n2 : "Деление на ноль!");
//            default -> System.out.println("Неверная операция");
//        }

//        double weight = 65;
//        double height = 1.70;
//
//        double bmi = weight / (height * height);
//
//        if (bmi < 18.5) {
//            System.out.println("Недовес");
//        } else if (bmi < 25) {
//            System.out.println("Норма");
//        } else if (bmi < 30) {
//            System.out.println("Лишний вес");
//        } else {
//            System.out.println("Ожирение");
//        }

//        for (int i = 1; i <= 30; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        int n = 7;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " * " + i + " = " + (n * i));
//        }

//        int sum = 0;
//        int i = 1;
//
//        while (i <= 100) {
//            sum += i;
//            i++;
//        }
//
//        System.out.println("Сумма: " + sum);

//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
//        System.out.println("Старт!");

//        int n1 = 1, n2 = 1;
//        System.out.print(n1 + " " + n2 + " ");
//
//        for (int i = 3; i <= 15; i++) {
//            int next = n1 + n2;
//            System.out.print(next + " ");
//            n1 = n2;
//            n2 = next;
//        }
//        System.out.println();

//        int n = 8;
//        long factorial = 1;
//
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("Факториал " + n + " = " + factorial);

//        for (int i = 2; i <= 50; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j * j <= i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();

//        int height = 6;
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int num = 9875;
//
//        do {
//            int sum = 0;
//            while (num > 0) {
//                sum += num % 10;
//                num /= 10;
//            }
//            num = sum;
//        } while (num > 9);
//
//        System.out.println("Цифровой корень: " + num);

//        int number = 12345;
//        int reversed = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversed = reversed * 10 + digit;
//            number /= 10;
//        }
//
//        System.out.println("Перевернутое число: " + reversed);

//        int rows = 6;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        int[] numbers = {7, 13, 21, 42, 69};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        int[] array = {10, 15, 23, 44, 5, 12, 31};
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        double average = (double) sum / array.length;
//
//        System.out.println("Сумма: " + sum);
//        System.out.println("Среднее значение: " + average);

//        int[] array = {1,2,3,4,5,6,7,8};
//        for (int i = 0; i <= array.length; i++) {
//            System.out.println();
//        }

//        int[] arr = {1,2,3,4,5};
//        for (int i = 5; i > 1; i--) {
//            System.out.println(i);
//        }
    }
}

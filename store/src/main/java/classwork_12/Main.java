package classwork_12;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print(i * j);
//            }
//        }
//        int sum = 0;
//        int i = 1;
//        while (i <= 100) {
//            sum += i;
//            i++;
//        }
//
//        System.out.println("Сумма чисел от 1 до 100 равна: " + sum);

//        int n = 15;
//        int first = 1;
//        int second = 1;
//
//        System.out.print("Первые 15 чисел Фибоначчи: ");
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(first + " ");
//            int next = first + second;
//            first = second;
//            second = next;
//        }
//        System.out.println();

//        int count = 10;
//
//        do {
//            System.out.println(count);
//            count--;
//        } while (count >= 1);
//
//        System.out.println("Старт!");

//        int rows = 5; // Высота пирамиды
//
//        for (int i = 1; i <= rows; i++) {
//            // Внутренний цикл печатает столько звёзд, каков номер текущей строки
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(); // Переход на новую строку
//        }

//        for (int i = 1; i <= 30; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        int targetNumber = (int) (Math.random() * 20) + 1;
//        int playerGuess = 0;
//
//        System.out.println("Я загадал число от 1 до 20. Попробуй угадать!");
//
//        while (playerGuess != targetNumber) {
//            playerGuess = scanner.nextInt();
//
//            if (playerGuess < targetNumber) {
//                System.out.println("Больше");
//            } else if (playerGuess > targetNumber) {
//                System.out.println("Меньше");
//            } else {
//                System.out.println("Поздравляю! Вы угадали!");
//            }
//        }
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("Чётное");
//        } else {
//            System.out.println("Нечётное");
//        }
//        System.out.print("Введите три числа: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        int max;
//
//        if (a >= b && a >= c) {
//            max = a;
//        } else if (b >= a && b >= c) {
//            max = b;
//        } else {
//            max = c;
//        }
//
//        System.out.println("Наибольшее число: " + max);
//        System.out.print("Введите балл (0-100): ");
//        int score = scanner.nextInt();
//
//        if (score >= 90 && score <= 100) {
//            System.out.println("Отлично");
//        } else if (score >= 70 && score <= 89) {
//            System.out.println("Хорошо");
//        } else if (score >= 50 && score <= 69) {
//            System.out.println("Удовлетворительно");
//        } else if (score >= 0 && score < 50) {
//            System.out.println("Неудовлетворительно");
//        } else {
//            System.out.println("Некорректный балл");
//        }

//        System.out.print("Введите первое число: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Введите операцию (+, -, *, /): ");
//        char operation = scanner.next().charAt(0);
//        System.out.print("Введите второе число: ");
//        double num2 = scanner.nextDouble();
//
//        switch (operation) {
//            case '+':
//                System.out.println("Результат: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Результат: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Результат: " + (num1 * num2));
//                break;
//            case '/':
//                if (num2 == 0) {
//                    System.out.println("Ошибка: Деление на ноль!");
//                } else {
//                    System.out.println("Результат: " + (num1 / num2));
//                }
//                break;
//            default:
//                System.out.println("Ошибка: Неверная операция!");
//                break;
//        }

//        System.out.print("Введите год: ");
//        int year = scanner.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("Високосный год");
//        } else {
//            System.out.println("Невисокосный год");
//        }

//        System.out.print("Введите месяц (1-12): ");
//        int month = scanner.nextInt();
//        System.out.print("Введите день: ");
//        int day = scanner.nextInt();
//
//        String zodiac = "";
//
//        switch (month) {
//            case 1:
//                zodiac = (day < 20) ? "Козерог" : "Водолей";
//                break;
//            case 2:
//                zodiac = (day < 19) ? "Водолей" : "Рыбы";
//                break;
//            case 3:
//                zodiac = (day < 21) ? "Рыбы" : "Овен";
//                break;
//            case 12:
//                zodiac = (day < 22) ? "Стрелец" : "Козерог";
//                break;
//            default:
//                zodiac = "Неизвестный месяц";
//        }
//
//        System.out.println("Знак зодиака: " + zodiac);

//        System.out.print("Введите три стороны треугольника: ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        if ((x + y > z) && (x + z > y) && (y + z > x)) {
//            System.out.print("Треугольник существует. Тип: ");
//
//            // 2. Определяем тип
//            if (x == y && y == z) {
//                System.out.println("Равносторонний");
//            } else if (x == y || x == z || y == z) {
//                System.out.println("Равнобедренный");
//            } else {
//                System.out.println("Разносторонний");
//            }
//        } else {
//            System.out.println("Треугольник с такими сторонами построить нельзя!");
//        }

//        int computerChoice = (int) (Math.random() * 3);
//
//        System.out.println("Введите ваш выбор (0 - Камень, 1 - Ножницы, 2 - Бумага): ");
//        int playerChoice = scanner.nextInt();
//
//        System.out.println("Выбор компьютера: " + computerChoice);
//
//        if (playerChoice == computerChoice) {
//            System.out.println("Ничья!");
//        } else if ((playerChoice == 0 && computerChoice == 1) ||
//                (playerChoice == 1 && computerChoice == 2) ||
//                (playerChoice == 2 && computerChoice == 0)) {
//            System.out.println("Вы выиграли!");
//        } else {
//            System.out.println("Компьютер выиграл!");
//        }

//        int[] favoriteNumbers = {7, 13, 42, 69, 100};
//
//        for (int i = 0; i < favoriteNumbers.length; i++) {
//            System.out.println("[" + i + "] = " + favoriteNumbers[i]);
//        }

//        int[] numbers = new int[8];
//
//        System.out.print("Массив: ");
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random() * 100) + 1;
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        int min = numbers[0];
//        int max = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//
//        System.out.println("Минимум: " + min);
//        System.out.println("Максимум: " + max);

//        double[] grades = {4.5, 3.0, 5.0, 4.2, 3.8, 4.0, 4.8, 3.5, 4.1, 5.0};
//        double sum = 0;
//
//        for (int i = 0; i < grades.length; i++) {
//            sum += grades[i];
//        }
//
//        double average = sum / grades.length;
//
//        System.out.println("Сумма оценок: " + sum);
//        System.out.println("Средний балл: " + average);

//        int[] original = {10, 20, 30, 40, 50, 60};
//        int[] reversed = new int[original.length];
//
//        for (int i = 0; i < original.length; i++) {
//            reversed[i] = original[original.length - 1 - i];
//        }
//
//        System.out.print("Оригинал: ");
//        for (int val : original) System.out.print(val + " ");
//        System.out.println();
//
//        System.out.print("Перевернутый: ");
//        for (int val : reversed) System.out.print(val + " ");
//        System.out.println();

//        int[] sourceArray = {5, 12, 8, 24, 3, 42, 17, 9, 11, 0};
//
//        System.out.print("Введите число для поиска: ");
//        int target = scanner.nextInt();
//
//        int foundIndex = -1;
//
//        for (int i = 0; i < sourceArray.length; i++) {
//            if (sourceArray[i] == target) {
//                foundIndex = i;
//                break;
//            }
//        }
//
//        if (foundIndex != -1) {
//            System.out.println("Элемент найден! Индекс: " + foundIndex);
//        } else {
//            System.out.println("Не найдено");
//        }

//        int[] array = {34, 12, 5, 78, 45, 1, 23};
//
//        System.out.print("До сортировки: ");
//        for (int num : array) System.out.print(num + " ");
//        System.out.println();
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.print("После сортировки: ");
//        for (int num : array) System.out.print(num + " ");
//        System.out.println();


    }
}

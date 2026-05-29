package classwork_14;

public class Tasks {
//    class Phone {
//        private String brand;
//        private String model;
//        private double batteryLife; // в часах
//
//        public Phone(String brand, String model, double batteryLife) {
//            this.brand = brand;
//            this.model = model;
//            this.batteryLife = batteryLife;
//        }
//
//        public void call(double duration) {
//            if (batteryLife <= 0) {
//                System.out.println("Телефон разряжен. Звонок невозможен.");
//                return;
//            }
//            // Уменьшаем батарею на duration / 10
//            batteryLife -= (duration / 10.0);
//            if (batteryLife < 0) batteryLife = 0;
//
//            // Переведем условно оставшиеся часы в проценты (допустим, макс. 24 часа = 100%)
//            // Или просто выведем остаток в часах/условных единицах для простоты:
//            System.out.println("Звонок... Осталось " + String.format("%.1f", batteryLife) + " ч. заряда.");
//        }
//    }
//    import java.util.Arrays;
//
//class Student {
//    private String name;
//    private String group;
//    private int[] grades;
//    private int size;
//
//    public Student(String name, String group) {
//        this.name = name;
//        this.group = group;
//        this.grades = new int[100]; // Запас под оценки
//        this.size = 0;
//    }
//
//    public void addGrade(int grade) {
//        if (size < grades.length) {
//            grades[size++] = grade;
//        }
//    }
//
//    public double averageGrade() {
//        if (size == 0) return 0.0;
//        double sum = 0;
//        for (int i = 0; i < size; i++) {
//            sum += grades[i];
//        }
//        return sum / size;
//    }
//
//    public void info() {
//        System.out.println("Студент: " + name + " | Группа: " + group + " | Средний балл: " + averageGrade());
//    }
//}
//class Animal {
//    protected String name;
//    protected int age;
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void makeSound() {
//        System.out.println("Животное издаёт звук");
//    }
//}
//
//    class Dog extends Animal {
//        public Dog(String name, int age) {
//            super(name, age);
//        }
//
//        @Override
//        public void makeSound() {
//            System.out.println("Гав! Меня зовут " + name);
//        }
//    }
//class Vehicle {
//    protected int speed;
//    protected int fuel;
//
//    public Vehicle(int speed, int fuel) {
//        this.speed = speed;
//        this.fuel = fuel;
//    }
//
//    public void move() {
//        System.out.println("Транспорт движется");
//    }
//}
//
//    class Car extends Vehicle {
//        public Car(int speed, int fuel) {
//            super(speed, fuel);
//        }
//
//        @Override
//        public void move() {
//            System.out.println("Машина едет со скоростью " + speed + " км/ч");
//        }
//    }
//
//    class Bicycle extends Vehicle {
//        public Bicycle(int speed, int fuel) {
//            super(speed, fuel);
//        }
//
//        @Override
//        public void move() {
//            System.out.println("Велосипед крутит педали");
//        }
//    }
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
}

    class Library {
        private Book[] books;

        public Library(Book[] books) {
            this.books = books;
        }

        public void searchByAuthor(String author) {
            System.out.println("Поиск книг автора: " + author);
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    System.out.println("- " + book.getTitle());
                }
            }
        }
    }
}

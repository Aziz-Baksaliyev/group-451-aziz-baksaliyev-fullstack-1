package classwork_10;

public class SecondMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Rectangle square = new Rectangle(7);

        System.out.println("Площадь прямоугольника: " + rect.area()); // 50.0
        System.out.println("Площадь квадрата: " + square.area());     // 49.0
    }
}

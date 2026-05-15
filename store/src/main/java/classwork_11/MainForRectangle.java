package classwork_11;

public class MainForRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println("Площадь: " + rect.area());
        System.out.println("Периметр: " + rect.perimeter());
        System.out.println("Это квадрат? " + rect.isSquare());
    }
}

package classwork_4;

public class MainForShape {
    public static void main(String[] args) {
        Shape myTriangle = new Triangle(10, 5);
        Shape mySquare = new Square(4);

        System.out.println("Площадь треугольника: " + myTriangle.area());
        System.out.println("Площадь квадрата: " + mySquare.area());
    }
}
package classwork_4;

public class Circle implements Drawable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Круг, Радиус: " + radius);
    }
}
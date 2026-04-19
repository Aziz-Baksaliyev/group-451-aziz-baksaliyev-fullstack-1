package classwork_4;

public class Rectangle implements Drawable {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Прямоугольник, Стороны: " + width + " x " + height);
    }
}
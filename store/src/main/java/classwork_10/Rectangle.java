package classwork_10;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width) {
        this(width, width);
    }

    public double area() {
        return width * height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
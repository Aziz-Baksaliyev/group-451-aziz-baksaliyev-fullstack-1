package classwork_4;

public class MainForDrawable {
    public static void main(String[] args) {
        Drawable[] shapes = new Drawable[2];
        shapes[0] = new Circle(10.5);
        shapes[1] = new Rectangle(4, 7);

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}
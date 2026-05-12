package classwork_10;

public class SixthMain {
    public static void main(String[] args) {
        Car anotherCar = new Car("BMW M5");
        Car.Engine engine = anotherCar.new Engine();
        engine.start();
    }
}

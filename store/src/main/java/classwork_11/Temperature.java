package classwork_11;

public class Temperature {
    private final double celsius;

    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    public static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    public static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5.0 / 9.0);
    }

    public static Temperature fromKelvin(double k) {
        return new Temperature(k - 273.15);
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }


    @Override
    public String toString() {
        return String.format("C: %.2f°, F: %.2f°, K: %.2f",
                toCelsius(), toFahrenheit(), toKelvin());
    }
}
package classwork_11;

public class MainForTemperature {
    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(25);
        System.out.println("Из Цельсия: " + t1);

        Temperature t2 = Temperature.fromFahrenheit(100);
        System.out.println("Из Фаренгейта: " + t2);

        Temperature t3 = Temperature.fromKelvin(0);
        System.out.println("Из Кельвина (абсолютный ноль): " + t3);
    }
}

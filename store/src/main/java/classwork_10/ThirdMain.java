package classwork_10;

public class ThirdMain {
    public static void main(String[] args) {
        System.out.println("Старт: " + Counter.getCount()); // 0

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("После создания 3 объектов: " + Counter.getCount()); // 3

        c1.destroy();
        System.out.println("После вызова destroy(): " + Counter.getCount());    // 2
    }
}
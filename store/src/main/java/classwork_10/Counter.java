package classwork_10;

public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }


    public void destroy() {
        if (count > 0) {
            count--;
        }
    }

    public static int getCount() {
        return count;
    }
}

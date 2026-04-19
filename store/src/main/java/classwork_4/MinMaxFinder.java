package classwork_4;

public class MinMaxFinder {

    public static void main(String[] args) {
        int[] numbers = {10, 2, 35, -5, 18};
        int[] result = findMinMax(numbers);

        if (result.length == 2) {
            System.out.println("Минимум: " + result[0]);
            System.out.println("Максимум: " + result[1]);
        }
    }

    static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[] {min, max};
    }
}
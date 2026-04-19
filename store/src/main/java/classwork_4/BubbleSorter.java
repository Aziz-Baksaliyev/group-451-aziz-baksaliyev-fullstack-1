package classwork_4;

import java.util.Arrays;

public class BubbleSorter {

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("До сортировки: " + Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }
}
package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = bubbleSort(numbers);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));

    }

    public static int[] bubbleSort(int array[]) {

        // iterate over array backwards
        for (int i = array.length; i >= 0; i--) {
            // iterate over array forwards
            for (int j = 0; j < array.length - 1; j++) {

                // compare jth and next number
                int k = j + 1;

                // swap if necessary
                if (array[j] > array[k]) {
                    int temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
        return array;
    }
}
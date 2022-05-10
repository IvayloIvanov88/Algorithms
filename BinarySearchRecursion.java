package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();


        Arrays.sort(numbers);

        int nearestNumber =
                nearestNumberBinarySearch(numbers, 0, numbers.length - 1, 30);
        System.out.println(nearestNumber);


    }

    private static int nearestNumberBinarySearch(int[] numbers, int start, int end, int myNumber) {
        int mid = (start + end) / 2;
        if (numbers[mid] == myNumber)
            return numbers[mid];
        if (start == end - 1)
            if (Math.abs(numbers[end] - myNumber) >= Math.abs(numbers[start] - myNumber))
                return numbers[start];
            else
                return numbers[end];
        if (numbers[mid] > myNumber)
            return nearestNumberBinarySearch(numbers, start, mid, myNumber);
        else
            return nearestNumberBinarySearch(numbers, mid, end, myNumber);

    }
}

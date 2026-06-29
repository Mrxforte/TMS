package lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n=================================");
        System.out.println("         ARRAY REVERSER          ");
        System.out.println("=================================");
        System.out.println("Original Array : " + Arrays.toString(numbers));

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        System.out.println("Result Array   : " + Arrays.toString(numbers));
        System.out.println("=================================");

        scanner.close();
    }
}


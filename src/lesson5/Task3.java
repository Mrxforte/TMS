package lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int firstMaxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                firstMaxIndex = i;
            }
        }

        System.out.println("\n--- Result ---");
        System.out.println("Maximum Value: " + max);
        System.out.println("First Occurrence Index: " + firstMaxIndex);

        scanner.close();
    }
}


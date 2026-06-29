package lesson5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean allPositive = true;

        for (int num : numbers) {
            if (num <= 0) {
                allPositive = false;
                break;
            }
        }

        System.out.println("\n--- Result ---");
        if (allPositive) {
            System.out.println("Yes, all numbers are positive.");
        } else {
            System.out.println("No, there are negative numbers or zero in the array.");
        }

        scanner.close();
    }
}


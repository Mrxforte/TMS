package lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Task7 {
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
        System.out.println("         ZERO SHIFTER            ");
        System.out.println("=================================");
        System.out.println("Original Array : " + Arrays.toString(numbers));

        int writePointer = 0;

        for (int currentPointer = 0; currentPointer < numbers.length; currentPointer++) {
            if (numbers[currentPointer] != 0) {
                numbers[writePointer] = numbers[currentPointer];
                if (writePointer != currentPointer) {
                    numbers[currentPointer] = 0;
                }
                writePointer++;
            }
        }

        System.out.println("Result Array   : " + Arrays.toString(numbers));
        System.out.println("=================================");

        scanner.close();
    }
}


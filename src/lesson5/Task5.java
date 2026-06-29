package lesson5;
import java.util.Scanner;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        if (size < 0) {
            System.out.println("Invalid array size.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        if (size > 0) {
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
        }

        System.out.println("\n=================================");
        System.out.println("         ARRAY SWAPPER           ");
        System.out.println("=================================");
        System.out.println("Original Array : " + Arrays.toString(numbers));

        if (numbers.length > 1) {
            int temp = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = temp;
            System.out.println("Status         : Swapped successfully!");
        } else {
            System.out.println("Status         : No swap (Array empty or has 1 element)");
        }

        System.out.println("Result Array   : " + Arrays.toString(numbers));
        System.out.println("=================================");

        scanner.close();
    }
}


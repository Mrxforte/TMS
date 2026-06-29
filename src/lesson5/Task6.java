package lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter " + size1 + " integers for first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("\nEnter size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter " + size2 + " integers for second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        boolean isEqual = true;
        String reason = "";

        if (array1.length != array2.length) {
            isEqual = false;
            reason = "Lengths are different.";
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                    reason = "Elements at index " + i + " do not match (" + array1[i] + " != " + array2[i] + ").";
                    break;
                }
            }
        }

        System.out.println("\n=================================");
        System.out.println("      ARRAY EQUALITY CHECK       ");
        System.out.println("=================================");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("---------------------------------");
        System.out.println("Result  : " + isEqual);
        if (!isEqual) {
            System.out.println("Reason  : " + reason);
        } else {
            System.out.println("Reason  : Arrays are perfectly identical.");
        }
        System.out.println("=================================");

        scanner.close();
    }
}

package lesson5;

import java.util.Scanner;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean isPalindrome = true;
        int start = 0;
        int end = numbers.length - 1;

        System.out.println("\n=========================================");
        System.out.println("        ARRAY PALINDROME CHECKER         ");
        System.out.println("=========================================");
        System.out.println("Target Array : " + Arrays.toString(numbers));
        System.out.println("-----------------------------------------");
        System.out.println("Comparison Steps:");

        if (numbers.length == 0) {
            System.out.println(" -> Array is empty.");
        }

        while (start < end) {
            System.out.printf(" -> Index [%d] (%d) vs Index [%d] (%d)", start, numbers[start], end, numbers[end]);

            if (numbers[start] != numbers[end]) {
                System.out.println("   MISMATCH!");
                isPalindrome = false;
                break;
            } else {
                System.out.println("   MATCH");
            }
            start++;
            end--;
        }

        System.out.println("-----------------------------------------");
        System.out.printf("Final Result : IS PALINDROME? -> %s\n", (isPalindrome ? "TRUE 🎉" : "FALSE ❌"));
        System.out.println("=========================================");

        scanner.close();
    }
}

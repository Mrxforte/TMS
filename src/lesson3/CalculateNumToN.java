package lesson3;

import java.util.Scanner;

public class CalculateNumToN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println("#".repeat(i));
        }

        scanner.close();
    }
}


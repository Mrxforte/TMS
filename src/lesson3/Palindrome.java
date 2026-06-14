package lesson3;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = 0;

        for (int temp = originalNumber; temp > 0; temp /= 10) {
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }

        scanner.close();
    }
}













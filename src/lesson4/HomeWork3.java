package lesson4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Let's input two strings to check if they are reversed words:\t");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine().trim().toLowerCase();
        String word2 = scanner.nextLine().trim().toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(word1).reverse();

        if ((word1.length() <= 100 && word2.length() <= 100) && stringBuilder.toString().equals(word2)) {
            System.out.println("Yes");
            System.out.println("This is palindrome");
        } else {
            System.out.println("No");
            System.out.println("This is not palindrome");
        }

        scanner.close();
    }
}

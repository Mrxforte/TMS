package lesson4;

import java.util.Scanner;

public class HomeWork2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any this tor revert\t");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println("Original " + string);
        stringBuilder.reverse();
        System.out.println("Reversed " + stringBuilder);
        scanner.close();
    }
}

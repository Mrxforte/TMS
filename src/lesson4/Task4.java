package lesson4;

import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word to get the first letter ASCII num\t");
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        System.out.println("Your the first letters char is\t" + ch);
        System.out.println("Your the first letters char ASCII num is is\t" + (int) ch);
        scanner.close();
    }
}

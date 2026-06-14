package lesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        int i = 1;
        while (i <= n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            i++;
        }

        System.out.println();
        scanner.close();
    }
}

package lesson2;

import java.util.Scanner;

public class AllNumsSum {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number    ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            System.out.println(sum);
            i++;
        }
        scanner.close();
    }
}

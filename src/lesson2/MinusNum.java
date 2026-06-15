package lesson2;

import java.util.Scanner;

public class MinusNum {
    static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any num\t");

        int num;

        do {
            num = scanner.nextInt();

            if (num >= 0) {
                System.out.println("Your num is\t" + num);
            } else {
                System.out.println("Your num is less than zero\t" + num);
            }

        } while (num >= 0);

        scanner.close();
    }

}

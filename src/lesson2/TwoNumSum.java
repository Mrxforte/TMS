package lesson2;

import java.util.Scanner;

public class TwoNumSum {

    static Integer twoNumSummary(int num1, int num2) {
        return num1 + num2;
    }

    static void printOut() {
        System.out.println("Please enter two nums to get summary");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter  the first num ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second num ");
        int num2 = scanner.nextInt();
        System.out.println("The summary" + "   " + num1 + "   " + "+" + "   " + num2 + "   =    " + (twoNumSummary(num1, num2)));
        scanner.close();
    }
}

package lesson3;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        while (num >= 10) {
            int sum = 0;
            String numStr = Integer.toString(num);

            for (int i = 0; i < numStr.length(); i++) {
                sum += Character.getNumericValue(numStr.charAt(i));
            }

            System.out.println("Step sum: " + sum);
            num = sum;
        }

        System.out.println("Final single digit result: " + num);
        scanner.close();
    }
}


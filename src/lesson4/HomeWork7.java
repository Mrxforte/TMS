package lesson4;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number!");
            runApp();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Input Set #" + i + " ---");
            StringBuilder currentResult = new StringBuilder();

            for (String label : new String[]{"First", "Second", "Third"}) {
                System.out.print("Enter " + label + " text: ");
                String input = scanner.nextLine().trim();

                if (!input.isEmpty()) {
                    String[] words = input.split("\\s+");
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            currentResult.append(word.charAt(0));
                        }
                    }
                }
            }

            System.out.println("Output for Set #" + i + ": " + currentResult.toString().toUpperCase());
        }

        scanner.close();
    }
}

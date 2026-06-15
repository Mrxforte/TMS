package lesson4;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        String game = scanner.nextLine();

        int scoreBalance = 0;

        for (int i = 0; i < count; i++) {
            char ch = game.charAt(i);
            if (ch == 'A' || ch == 'a') {
                scoreBalance++;

            } else if (ch == 'D' || ch == 'd') {
                scoreBalance--;
            }

        }

        if (scoreBalance > 0) {
            System.out.println("Anton wins");
            System.out.println(game.toUpperCase());
        } else if (scoreBalance < 0) {
            System.out.println("Danik wins");
            System.out.println(game.toUpperCase());
        } else {
            System.out.println("Friendship");
            System.out.println(game.toUpperCase());
        }
        scanner.close();

    }
}

package lesson2;

import java.util.Scanner;

public class EntryScores {
    static void outPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your entry score\t");
        int entryScore = scanner.nextInt();
        if (entryScore >= 90 && entryScore <= 100) {
            System.out.println("Your score is A:\t" + entryScore);
        } else if (entryScore >= 75 && entryScore <= 89) {
            System.out.println("Your score is B:\t" + entryScore);
        } else if (entryScore >= 50 && entryScore <= 74) {
            System.out.println("Your score is C:\t" + entryScore);
        } else if (entryScore >= 30 && entryScore <= 49) {
            System.out.println("Your score is D:\t" + entryScore);
        } else if (entryScore >= 29 && entryScore == 0) {
            System.out.println("Your score is F:\t" + entryScore);
        }
    }
}

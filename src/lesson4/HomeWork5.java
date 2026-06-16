package lesson4;

import java.util.Scanner;

public class HomeWork5 {
    static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two str to compare:\t");
        String gift1 = scanner.nextLine();
        String gift2 = scanner.nextLine();
        int len1 = gift1.length();
        int len2 = gift2.length();
//        check to length
        if (len1 < 1 || len1 > 100 || len2 < 1 || len2 > 100) {
            System.out.println("Max length is 100");
            runApp();
        }

//        check to same length between strings
        if (len1 != len2) {
            System.out.println("Please enter the same length str");
            runApp();
        }

        char ch1 = gift1.charAt(0);
        char ch2 = gift2.charAt(0);

        if (ch1 < ch2) {
            System.out.println(-1);
        } else if (ch1 > ch2) {
            System.out.println(1);

        } else {
            System.out.println(0);
        }

        runApp();

        scanner.close();
    }

}

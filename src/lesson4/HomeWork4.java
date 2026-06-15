package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of outputs: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int entry = 0;
        List<String> list = new ArrayList<>();

        while (entry < count) {
            System.out.print("Enter word " + (entry + 1) + ": ");
            String str = scanner.nextLine().trim();

            if (str != null && str.length() > 2) {
                char ch1 = str.charAt(0);
                char ch2 = str.charAt(str.length() - 1); // Oxirgi indeks (length - 1)
                int len = str.length() - 2;

                str = ch1 + String.valueOf(len) + ch2;
            }

            list.add(str);
            entry++;
        }

        System.out.println("\n--- Final Results ---");
        for (String element : list) {
            System.out.println(element);
        }

        scanner.close();
    }
}

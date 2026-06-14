package lesson2;

import java.util.Scanner;

public class PrintUntill {
    static void outPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number  ");
        int num = scanner.nextInt();
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
        scanner.close();
    }
}

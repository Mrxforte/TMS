package lesson4;

import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string to trim all spaces\t");
        String outPut = scanner.nextLine().replace(" ", "");
        System.out.println(outPut);
        scanner.close();
    }
}

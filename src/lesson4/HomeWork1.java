package lesson4;

import java.util.Scanner;

public class HomeWork1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word to capitalize:\t");
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(str);
        } else {
            String result = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.println(result);
        }
        scanner.close();
    }

}

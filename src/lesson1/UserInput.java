package lesson1;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name  ");
        String name = scanner.nextLine();
        System.out.println("Hello   " + name + "  welcome to user input name");
        scanner.close();
    }
}

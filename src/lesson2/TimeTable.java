package lesson2;

import java.util.Scanner;

public class TimeTable {
    static void outPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number To calculate the time table\t");
        int num = scanner.nextInt();
        int timeTableNumber = 9;
        int i = 1;
        while (i <= timeTableNumber) {
            System.out.println(num + " * " + i + " = " + (i * timeTableNumber));
            i++;
        }
    }
}

package lesson5;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex] = num;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = num;
                oddIndex++;
            }
        }

        System.out.println("\n=================================");
        System.out.println("       EVEN & ODD ANALYSIS       ");
        System.out.println("=================================");

        System.out.printf("Total Even Numbers : %d\n", evenCount);
        System.out.print("Even Elements      : [ ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        System.out.println("---------------------------------");

        System.out.printf("Total Odd Numbers  : %d\n", oddCount);
        System.out.print("Odd Elements       : [ ");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        System.out.println("=================================");

        scanner.close();
    }
}


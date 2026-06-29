package lesson6;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] inputArray = {"cherry", "date", "apple", "banana",};
        System.out.println("=========================================");
        System.out.println("Input: " + Arrays.toString(inputArray));
        Arrays.sort(inputArray);
        System.out.println("Output: " + Arrays.toString(inputArray));
        System.out.println("=========================================");
    }
}


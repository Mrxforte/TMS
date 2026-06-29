package lesson6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int[] inputArray = {4, -3, 2, -1, 0, -5};
        int[] result = IntStream.concat(
                Arrays.stream(inputArray).filter(x -> x < 0),
                Arrays.stream(inputArray).filter(x -> x >= 0)
        ).toArray();
        System.out.println("===========================================");
        System.out.println("Input: " + Arrays.toString(inputArray));
        System.out.println("Output: " + Arrays.toString(result));
        System.out.println("===========================================");

    }
}

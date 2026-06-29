package lesson6;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        int[] inputArray = {4, 2, 2, 8, 5, 6, 8, 5};

        Set<Integer> sortedSet = new TreeSet<>();
        for (int num : inputArray) {
            sortedSet.add(num);
        }

        int[] result = new int[sortedSet.size()];
        int index = 0;
        for (int num : sortedSet) {
            result[index++] = num;
        }

        System.out.println("Output: " + Arrays.toString(result));
    }
}


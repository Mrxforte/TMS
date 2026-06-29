package lesson6;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int[] inputArray = {4, -3, 2, -1, 0, -5};
        inputArray = new int[]{4, 5, 6, 5, 4, 3};
        System.out.println("Input Array" + Arrays.toString(inputArray));
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : inputArray) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : inputArray) {
            list.add(num);
        }

        list.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            }
            return Integer.compare(a, b);
        });

        int[] result = new int[inputArray.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        System.out.println("Output: " + Arrays.toString(result));
    }
}


package lesson6;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] inputArray = {4, 3, 2, 1};

        System.out.println("Input: " + Arrays.toString(inputArray));

        int n = inputArray.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = inputArray[i];
            pair[i][1] = i;
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || pair[i][1] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pair[j][1];
                cycleSize++;
            }

            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }

        System.out.println("Output: " + swaps);
    }
}


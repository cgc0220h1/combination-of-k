import java.util.Arrays;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        int[] input = IntStream.range(0 , 5).toArray();
        printCombination(input, 3);
    }

    private static void printCombination(int[] input, int k) {
        int[] temp = new int[k];
        printCombination(input, temp, 0, 0, k);
    }

    private static void printCombination(int[] input, int[] temp, int root, int start, int k) {
        for (int i = start; i < input.length; i++) {
            temp[root] = input[i];
            if (root == k - 1) {
                System.out.println(Arrays.toString(temp));
            } else {
                int newRoot = root + 1;
                int newStart = ++start;
                printCombination(input, temp, newRoot, newStart, k);
            }
        }
    }
}

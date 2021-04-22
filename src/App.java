import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        List<int[]> result = new ArrayList<>();
        for (int[] combination : combinationList(input, 0, result)) {
            System.out.println(Arrays.toString(combination));
        }
    }

    public static List<int[]> combinationList(int[] input, int rootIndex, List<int[]> listInt) {
        if (rootIndex == input.length - 1) {
            return listInt;
        }
        for (int i = rootIndex + 1; i < input.length; i++) {
            int[] combination = new int[2];
            combination[0] = input[rootIndex];
            combination[1] = input[i];
            listInt.add(combination);
        }
        int root = ++rootIndex;
        return combinationList(input, root, listInt);
    }
}

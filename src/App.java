import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < input.length; i++) {
            int[] output = new int[3];
            output[0] = input[i];
            for (int j = i + 1; j < input.length; j++) {
                output[1] = input[j];
                for (int k = j + 1; k < input.length; k++) {
                    output[2] = input[k];
                    System.out.println(Arrays.toString(output));
                }
            }
        }
    }
}

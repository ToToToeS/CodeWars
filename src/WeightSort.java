import java.util.Arrays;

public class WeightSort {
    public static String orderWeight(String strng) {
        String[] weights = strng.trim().split("\\s+");

        Arrays.sort(weights, (a, b) -> {
            int sumA = a.chars().map(ch -> ch - '0').sum();
            int sumB = b.chars().map(ch -> ch - '0').sum();

            if (sumA == sumB) {
                return a.compareTo(b);
            }
            return Integer.compare(sumA, sumB);
        });

        return String.join(" ", weights);
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array2.length; j++) {
              if (array2[j].contains(array1[i])) result.add(array1[i]);
            }
        };

        return result.stream().distinct().sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] a = new String[]{ "arp", "live", "strong" };
        String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        Arrays.stream(WhichAreIn.inArray(a, b)).forEach(System.out::println);

    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) result.add(array1[i]);
            }
        }
        result.sort(Comparator.naturalOrder());
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        Arrays.stream(WhichAreIn.inArray(a, b)).forEach(System.out::println);

    }
}

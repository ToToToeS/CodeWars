import java.util.ArrayList;
import java.util.List;

public class Josephus {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        List<T> copy = new ArrayList<>(items);
        int step = k -1;
        int index = 0;
        while (items.size() != result.size()) {
            index += step;

            while (index >= copy.size() && !copy.isEmpty()) {
                index -= copy.size();
            }

            result.add(copy.get(index));
            copy.remove(index);
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(josephusPermutation(List.of("C", "o", "d", "e", "W", "a", "r", "s"), 4));
    }
}
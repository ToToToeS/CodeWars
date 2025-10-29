import java.util.HashMap;
import java.util.Map;

public class Kata1 {
    public static Map<Character, Integer> count(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character sym : chars) {
            map.put(sym ,map.getOrDefault(sym, 0) + 1);
        }

        return map;
    }
}
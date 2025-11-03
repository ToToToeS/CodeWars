import java.util.LinkedHashMap;
import java.util.Map;

public class Kata {
    public static String firstNonRepeatingLetter(String s) {
        String smallS = s.toLowerCase();
        Map<String, Integer> counter = new LinkedHashMap<>();

        for (String c : smallS.split("")) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        String symbol = "";
        for (var key : counter.keySet()) {
            if (counter.get(key) == 1) {
                symbol = key;
                break;
            }
        }

        for (var c : s.split("")) {
            if (symbol.equalsIgnoreCase(c)) return c;
        }
        return "";
    }
}
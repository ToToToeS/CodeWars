import java.util.*;
import java.util.stream.Collectors;

public class TopWords {
    public static List<String> top3(String s) {
        Map<String, Integer> map = new HashMap<>();
        s = s.replaceAll("[\\p{P}&&[^']\\p{S}\n]+", " ")
                .replaceAll("\\s+", " ")
                .trim();
        String[] words = s.split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
       List<Map.Entry<String, Integer>> entry = map.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue())
                .collect(Collectors.toList());


        List<String> result = new ArrayList<>();

        int i = 0;
        while (result.size() < 3 && i < entry.size()) {
            if (!entry.get(i).getKey().isBlank() && entry.get(i).getKey().matches(".*[a-zA-Zа-яА-ЯёЁ].*")) {
                result.add(entry.get(i).getKey());
            }
            i++;
        }



        return result;
    }

    public static void main(String[] args) {
        System.out.println(top3("a a a  b  c c  d d d d  e e e e e"));
    }
}
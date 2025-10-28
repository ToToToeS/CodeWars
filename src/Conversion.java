import java.util.LinkedHashMap;
import java.util.Map;

public class Conversion {
    private  Map<Integer, String> romanDigits =  new LinkedHashMap<>();

    {
        romanDigits.put(1000, "M");
        romanDigits.put(900, "CM");
        romanDigits.put(500, "D");
        romanDigits.put(400, "CD");
        romanDigits.put(100, "C");
        romanDigits.put(90, "XC");
        romanDigits.put(50, "L");
        romanDigits.put(40, "XL");
        romanDigits.put(10, "X");
        romanDigits.put(9, "IX");
        romanDigits.put(8, "VIII");
        romanDigits.put(7, "VII");
        romanDigits.put(6, "VI");
        romanDigits.put(5, "V");
        romanDigits.put(4, "IV");
        romanDigits.put(3, "III");
        romanDigits.put(2, "II");
        romanDigits.put(1, "I");
    }

    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer num : romanDigits.keySet()) {
            String romanDigit = romanDigits.get(num);
            int x = n / num;

            for (int i = 0; i < x; i++) {
                stringBuilder.append(romanDigit);
            }
            if (x != 0) n = n - x * num;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println( new Conversion().solution(91));
    }
}

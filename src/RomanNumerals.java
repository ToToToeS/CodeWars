import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {
    private static final Map<String, Integer> symbolToValue = new LinkedHashMap<>();
    private static final Map<Integer, String> valueToSymbol = new LinkedHashMap<>();

    static {
        symbolToValue.put("M", 1000);
        symbolToValue.put("CM", 900);
        symbolToValue.put("D", 500);
        symbolToValue.put("CD", 400);
        symbolToValue.put("C", 100);
        symbolToValue.put("XC", 90);
        symbolToValue.put("L", 50);
        symbolToValue.put("XL", 40);
        symbolToValue.put("X", 10);
        symbolToValue.put("IX", 9);
        symbolToValue.put("VIII", 8);
        symbolToValue.put("VII", 7);
        symbolToValue.put("VI", 6);
        symbolToValue.put("V", 5);
        symbolToValue.put("IV", 4);
        symbolToValue.put("III", 3);
        symbolToValue.put("II", 2);
        symbolToValue.put("I", 1);
        for (Map.Entry<String, Integer> entry : symbolToValue.entrySet()) {
            valueToSymbol.put(entry.getValue(), entry.getKey());
        }
    }

    public static String toRoman(int n) {
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Integer, String> entry: valueToSymbol.entrySet() ){
            int i = entry.getKey();
            String s = entry.getValue();
            while( n>=i ){
                builder.append(s);
                n -= i;
            }
        }
        return builder.toString();
    }


    public static int fromRoman(String romanNumeral) {
        int result = 0;
        String[] strArr = romanNumeral.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (i + 1 < strArr.length && null != symbolToValue.get(strArr[i] + strArr[i + 1])) {
                result += symbolToValue.get(strArr[i] + strArr[i + 1]);
                i++;
            } else result += symbolToValue.get(strArr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(RomanNumerals.toRoman(5473));
    }
}
public class Kata {

    public static String high(String s) {
        String[] words = s.split(" ");
        String high = "";
        Character c = 'd';


        for (String word : words) {
            int b = compare(high,word);
            if (compare(high,word) <= 0) high = word;
        }


        return high;
    }

    private static int compare(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int sum1 = 0;
        int sum2 = 0;

        for (char c : chars1) {
            sum1 += c - 96;
        }

        for (char c : chars2) {
            sum2 += c - 96;
        }

        return sum1 - sum2;
    }

    public static void main(String[] args) {
        Kata.high("aa b");
    }
}
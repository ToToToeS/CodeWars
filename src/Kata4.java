public class Kata4 {
    public static String rot13(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                        chars[i] = (char) ('A' + ((chars[i] + 13) % 26));
                } else {
                    chars[i] = (char) ('a' + ((chars[i] + 13) % 26));
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(rot13("test"));
    }
}
    public class StripComments {

        public static String stripComments(String text, String[] commentSymbols) {
            StringBuilder stringBuilder = new StringBuilder(text);
            for (String commentSymbol : commentSymbols) {
                int i = text.indexOf(commentSymbol);
                while (i < stringBuilder.length() && stringBuilder.charAt(i) != '\n') stringBuilder.deleteCharAt(i);
            }

            return stringBuilder.toString();
        }

        public static void main(String[] args) {
            System.out.println(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
        }
    }

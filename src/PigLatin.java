public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++){
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            if (Character.isLetter((words[i].charAt(0)))){
                stringBuilder.append(stringBuilder.charAt(0));
                stringBuilder.deleteCharAt(0);
                stringBuilder.append("ay");
            }
            result.append(" ").append(stringBuilder);
        }

        result.deleteCharAt(0);

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(PigLatin.pigIt("Hello !"));
    }
}
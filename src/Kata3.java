public class Kata3 {
    public static String add(String a, String b) {
        a = a.replaceAll("^0+", "");
        b = b.replaceAll("^0+", "");
        StringBuilder sbA = new StringBuilder(a);
        StringBuilder sbB = new StringBuilder(b);
        StringBuilder result = new StringBuilder();

        StringBuilder minStr = sbA.length() < sbB.length() ? sbA : sbB;
        StringBuilder maxStr = sbA.length() < sbB.length() ? sbB : sbA;

        int maxIndex = maxStr.length() - 1;
        int minIndex = minStr.length() - 1;

        int inMember = 0;
        while (minIndex >= 0) {
            int sum = Character.getNumericValue(minStr.charAt(minIndex)) +
                    Character.getNumericValue(maxStr.charAt(maxIndex))+ inMember;

            result.insert(0, sum%10);
            inMember = sum / 10;

            minIndex--;
            maxIndex--;
        }

        while (maxIndex >= 0) {
            int sum = Character.getNumericValue(maxStr.charAt(maxIndex)) + inMember;
            result.insert(0, sum%10);
            inMember = sum / 10;
            maxIndex--;
        }

        if (inMember != 0) result.insert(0, inMember);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(add("123", "456"));
    }
}
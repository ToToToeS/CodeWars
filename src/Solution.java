public class Solution {
    public static int zeros(int n) {
        int counter = 0;

        for (int i = 5; i/5 > 0; i *= 5) {
            counter = n / i;
        }
        return counter;
    }
}
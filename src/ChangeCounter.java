import java.util.Arrays;

public class ChangeCounter {
    public static int countChange(final int money, final int[] coins) {
        Arrays.sort(coins);
        return recurs(0, money, coins, 0);
    }

    public static int recurs(int currentSum, int money, int[] coins, int startIndex){
        if (currentSum == money) return 1;
        if (currentSum > money) return 0;

        int count = 0;
        for (int i = startIndex; startIndex < coins.length; startIndex++) {
            count += recurs(currentSum + coins[i], money, coins, startIndex);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countChange(10, new int[]{5,2,3}));
    }
}
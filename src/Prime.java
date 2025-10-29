public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) return false;

        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
import java.util.ArrayList;
import java.util.List;

public class ProdFib {

    public static long[] productFib(long prod) {
        int i = 2;
        List<Long> fib = new ArrayList<>();
        fib.add(0L);
        fib.add(1L);
        fib.add(1L);


        while (prod >= fib.get(i) * fib.get(i - 1)) {
            if (fib.get(i) * fib.get(i - 1) == prod) return new long[]{fib.get(i - 1), fib.get(i), 1};
            fib.add(fib.get(i)+fib.get(i - 1));
            i++;
        }

        fib.stream().forEach(System.out::println);

        return new long[]{fib.get(i - 1), fib.get(i), 0};
    }
}
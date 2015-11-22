package primeFactors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        int candidate = 2;
        while (n > 1) {
            for (; n%candidate == 0; n/=candidate) {
                primes.add(candidate);
            }
            candidate++;
        }
        return primes;
    }
}

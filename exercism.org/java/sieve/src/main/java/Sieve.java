import java.util.ArrayList;
import java.util.List;


class Sieve {
    private final List<Integer> primes = new ArrayList<>();

    Sieve(int maxPrime) {
        if (maxPrime <= 1) return;

        boolean[] table = new boolean[maxPrime];
        table[0] = true;

//        for (int i = 2; i * i < maxPrime; i++)
//            for (int j = 2; i * j <= maxPrime; j++)
//                 table[i * j - 1] = true;

        for (int i = 2; i * i < maxPrime; i++)
            if (!table[i - 1])
                // multiples less than i*i would have already been marked by smaller prime factors.
                for (int j = i * i; j <= maxPrime; j += i) // increment by i, no need to multiply.
                     table[j - 1] = true;

        for (int i = 0; i < maxPrime; i++)
            if (!table[i]) primes.add(i + 1);
    }

    List<Integer> getPrimes() {
        return primes;
    }
}

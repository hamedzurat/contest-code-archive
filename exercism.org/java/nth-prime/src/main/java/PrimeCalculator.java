class PrimeCalculator {
    boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;

        return true;
    }

    int nth(int nth) {
        if (nth <= 0) throw new IllegalArgumentException();

        if (nth == 1) return 2;
        nth--;
        int nthPrime = 1;

        while (nth != 0) {
            nthPrime += 2;
            if (isPrime(nthPrime)) nth--;
        }

        return nthPrime;
    }
}

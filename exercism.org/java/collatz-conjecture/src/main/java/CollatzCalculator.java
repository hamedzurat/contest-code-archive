class CollatzCalculator {
    int computeStepCount(int n) {
        int count = 1;

        if (n < 1) throw new IllegalArgumentException("Only positive integers are allowed");
        else if (n == 1) return 0;

        while ((n = (n % 2 == 0) ? n / 2 : (3 * n) + 1) != 1) count++;

        return count;
    }
}

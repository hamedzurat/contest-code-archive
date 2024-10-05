import java.util.stream.IntStream;


class LargestSeriesProductCalculator {
    private final String input;

    LargestSeriesProductCalculator(String input) {
        if (!input.matches("\\d*")) throw new IllegalArgumentException("String to search may only contain digits.");

        this.input = input;
    }

    long calculateLargestProductForSeriesLength(int span) {
        if (span < 0) throw new IllegalArgumentException("Series length must be non-negative.");
        if (span > input.length())
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        //        ArrayList<String> series = new ArrayList<>();
        //        for (int i = 0; i <= input.length() - span; i++)
        //            series.add(input.substring(i, i + span));
        //
        //        return series.stream()
        //                     .mapToLong(s -> s.chars()
        //                                      .mapToLong(i -> i - '0')
        //                                      .reduce(1L, Math::multiplyExact))
        //                     .max()
        //                     .orElse(Integer.MIN_VALUE);

        return IntStream.range(0, input.length() - span + 1)
                        .mapToLong(i -> input.substring(i, i + span)
                                             .chars()
                                             .mapToLong(c -> c - '0')
                                             .reduce(1L, Math::multiplyExact))
                        .max()
                        .orElse(0);
    }
}

import java.util.stream.IntStream;


class NaturalNumber {
    private final Classification nicomachus;

    NaturalNumber(int number) {
        if (number < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        int aliquot_sum = IntStream.rangeClosed(1, number / 2)
                                   .parallel()
                                   .filter(i -> number % i == 00)
                                   .distinct()
                                   .sum();

        if (number < aliquot_sum) nicomachus = Classification.ABUNDANT;
        else if (number > aliquot_sum) nicomachus = Classification.DEFICIENT;
        else nicomachus = Classification.PERFECT;
    }

    Classification getClassification() {
        return nicomachus;
    }
}

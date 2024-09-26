import java.util.stream.IntStream;


class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        String cleanedInput = stringToVerify.replace("-", "");

        if (!cleanedInput.matches("[0-9]{9}[0-9X]")) return false;

        int sum = IntStream.range(0, 10).map(i -> {
            char c     = cleanedInput.charAt(i);
            int  value = (c == 'X') ? 10 : Character.getNumericValue(c);
            return value * (10 - i);
        }).sum();

        return sum % 11 == 0;

        //        if (!stringToVerify.matches("[X0-9-]+")) return false;
        //        if (stringToVerify.contains("X") && (stringToVerify.indexOf('X') != stringToVerify.length() - 1)) return false;
        //
        //        //  In Java, local variables used inside lambda expressions must be effectively final.
        //        AtomicInteger x          = new AtomicInteger(10);
        //        AtomicInteger numOfDigit = new AtomicInteger(0);
        //
        //        int sum = stringToVerify.chars()
        //                                .filter(c -> Character.isDigit(c) || c == 'X')
        //                                .peek(i -> numOfDigit.incrementAndGet())
        //                                .map(c -> {
        //                                    if (c == 'X') return 10;
        //                                    else return c - '0';
        //                                })
        //                                .map(i -> i * x.getAndDecrement())
        //                                .sum();
        //
        //        return (numOfDigit.get() == 10) && (sum % 11 == 0);
    }
}

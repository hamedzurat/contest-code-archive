class RotationalCipher {
    private final int shift;

    RotationalCipher(int shiftKey) {
        shift = shiftKey;
    }

    String rotate(String data) {
        return data.chars().map(c -> {
                       if (Character.isLowerCase(c)) return (c - 'a' + shift) % 26 + 'a';
                       else if (Character.isUpperCase(c)) return (c - 'A' + shift) % 26 + 'A';
                       else return c;
                   })
                   //                   .map(c -> Character.isLowerCase(c)
                   //                             ? (c - 'a' + shift) % 26 + 'a'
                   //                             : Character.isUpperCase(c) ? (c - 'A' + shift) % 26 + 'A'
                   //                                                        : c
                   //                   )
                   .collect(StringBuilder::new, // This is a supplier that provides a fresh, empty StringBuilder at the start of the collection process.
                           StringBuilder::appendCodePoint, // This is the accumulator, which defines how each character (represented as a code point) is added to the StringBuilder.
                           StringBuilder::append) // This is the combiner, used when the stream is processed in parallel to merge multiple partial results. It defines how to combine two StringBuilder instances together.
                   .toString();
    }
}

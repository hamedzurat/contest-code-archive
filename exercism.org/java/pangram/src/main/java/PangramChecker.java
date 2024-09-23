public class PangramChecker {
    public boolean isPangram(String input) {
        return input.toUpperCase().chars().filter(Character::isLetter).map(c -> c - 'A').distinct().count() == 26;

        //        boolean[] alphabet = new boolean[26];
        //
        //        for (Character c : input.toUpperCase().toCharArray())
        //            if (Character.isLetter(c)) alphabet[c - 'A'] = true;
        //
        //        return IntStream.range(0, alphabet.length).allMatch(i -> alphabet[i]);
    }
}

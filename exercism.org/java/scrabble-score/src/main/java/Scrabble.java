import java.util.HashMap;
import java.util.Map;


class Scrabble {
    private final Map<Character, Integer> dict = new HashMap<>();
    private final int                     scores;

    {
        addToDict("AEIOULNRST", 1);
        addToDict("DG", 2);
        addToDict("BCMP", 3);
        addToDict("FHVWY", 4);
        addToDict("K", 5);
        addToDict("JX", 8);
        addToDict("QZ", 10);
    }

    Scrabble(String word) {
        scores = word.chars().map(c -> dict.getOrDefault((char) c, 0)).sum();
    }

    private void addToDict(String letters, int value) {
        for (char c : letters.toUpperCase().toCharArray()) dict.put(c, value);
        for (char c : letters.toLowerCase().toCharArray()) dict.put(c, value);
    }

    int getScore() {
        return scores;
    }
}

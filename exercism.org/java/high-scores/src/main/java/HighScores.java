import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class HighScores {
    private final ArrayList<Integer> scores;

    public HighScores(List<Integer> highScores) {
        scores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.get(scores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        return scores.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
    }
}

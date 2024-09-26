import java.util.List;


class IsogramChecker {
    boolean isIsogram(String phrase) {
        List<Character> chars = phrase.toLowerCase()
                                      .chars()
                                      .filter(Character::isLetter)
                                      .mapToObj(c -> (char) c)
                                      .toList();

        return chars.stream().distinct().count() == chars.size();

        //        Set<Character> seen = new HashSet<>();
        //
        //        for (char c : phrase.toUpperCase().toCharArray())
        //            if (Character.isLetter(c) && !seen.add(c)) return false;
        //
        //        return true;
    }
}

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean hasUniqueToMe = myCollection.stream().anyMatch(card -> !theirCollection.contains(card));
        boolean hasUniqueToThem = theirCollection.stream().anyMatch(card -> !myCollection.contains(card));

        return hasUniqueToMe && hasUniqueToThem;
    }

    public static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));

        for (Set<String> c : collections)
            common.retainAll(c);

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        for (Set<String> col : collections)
            all.addAll(col);
        return all;
    }
}

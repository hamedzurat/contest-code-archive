import java.util.HashMap;
import java.util.Map;


class ResistorColor {
    private final Map<String, Integer> std = new HashMap<String, Integer>();

    {
        std.put("black", 0);
        std.put("brown", 1);
        std.put("red", 2);
        std.put("orange", 3);
        std.put("yellow", 4);
        std.put("green", 5);
        std.put("blue", 6);
        std.put("violet", 7);
        std.put("grey", 8);
        std.put("white", 9);
    }

    int colorCode(String color) {
        return std.getOrDefault(color, -1);
    }

    String[] colors() {
        return std.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue())
                  .map(Map.Entry::getKey) // .map(entry -> entry.getKey())
                  .toArray(String[]::new); // .toArray(size -> new String[size])

        //        return std.keySet().stream().sorted((s1, s2) -> std.get(s1) - std.get(s2)).toArray(String[]::new);
    }
}

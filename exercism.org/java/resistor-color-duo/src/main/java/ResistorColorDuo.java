import java.util.List;


class ResistorColorDuo {
    private final List<String> std = List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    int value(String[] colors) {
        return (std.indexOf(colors[0]) * 10) + std.indexOf(colors[1]);
    }
}

import java.util.ArrayList;
import java.util.List;


class KindergartenGarden {
    private final String[]          rows;
    private final ArrayList<String> kids = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"));

    KindergartenGarden(String garden) {
        rows = garden.split("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> output = new ArrayList<>();

        int studentIndex = kids.indexOf(student) * 2;

        output.add(Plant.getPlant(rows[0].charAt(studentIndex)));
        output.add(Plant.getPlant(rows[0].charAt(studentIndex + 1)));
        output.add(Plant.getPlant(rows[1].charAt(studentIndex)));
        output.add(Plant.getPlant(rows[1].charAt(studentIndex + 1)));

        return output;
    }
}

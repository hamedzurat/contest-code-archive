import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


class Matrix {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

    Matrix(String matrixAsString) {
        //        String[] rows = matrixAsString.split("\n");
        //
        //        for (int i = 0; i < rows.length; i++) {
        //            matrix.add(new ArrayList<>());
        //
        //            Scanner sc = new Scanner(rows[i]);
        //            while (sc.hasNextInt()) matrix.get(i).add(sc.nextInt());
        //        }

        matrix = Arrays.stream(matrixAsString.split("\n"))
                       .map(row -> Arrays.stream(row.split("\\s+"))
                                         .map(Integer::parseInt)
                                         .collect(Collectors.toCollection(ArrayList::new)))
                       .collect(Collectors.toCollection(ArrayList::new));
    }

    int[] getRow(int rowNumber) {
        return matrix.get(rowNumber - 1).stream().mapToInt(Integer::intValue).toArray();
    }

    int[] getColumn(int columnNumber) {
        return matrix.stream().mapToInt(row -> row.get(columnNumber - 1)).toArray();
    }
}
